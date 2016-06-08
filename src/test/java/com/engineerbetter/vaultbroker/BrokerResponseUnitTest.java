package com.engineerbetter.vaultbroker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.web.client.RestTemplate;

public class BrokerResponseUnitTest {
	
	   private RestTemplate rest = new TestRestTemplate();
	
	   private BrokerResponse Broker;
		
	   @Test
	   public void testBrokerResponse() 
	   {
		  Broker = new BrokerResponse();
		  
	      assertEquals(Broker.getResponse(),"Hello!");
	   }	
	

}
 