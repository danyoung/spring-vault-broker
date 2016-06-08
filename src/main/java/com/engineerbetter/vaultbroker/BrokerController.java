package com.engineerbetter.vaultbroker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerController {
	private InstanceManager manager;

	@RequestMapping("/")
	public BrokerResponse getResponse() {
		
		return new BrokerResponse();
	
	}


}
