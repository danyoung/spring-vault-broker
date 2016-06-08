package com.engineerbetter.vaultbroker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={BrokerApp.class})
@WebIntegrationTest(randomPort = true)
@ActiveProfiles("test")
public class BrokerAppSmokeTest {

	@Value("${local.server.port}")
	private int port;
	private RestTemplate rest = new TestRestTemplate();

	@Test
	public void appRespondsOnRootPath()
	{
		ResponseEntity<String> response = rest.getForEntity("http://127.0.0.1:"
				+ port, String.class);
		assertThat(response.getStatusCode(), is(HttpStatus.OK));
	}
}
