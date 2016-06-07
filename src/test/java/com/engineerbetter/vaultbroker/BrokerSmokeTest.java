package com.engineerbetter.vaultbroker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrokerSmokeTest {
	
	   private BrokerController Broker;
		
	   @Test
	   public void testBrokerResponse() 
	   {
		  Broker = new BrokerController();
		  
	      assertEquals(Broker.getMessage(),"Hello!");
	   }	
	

}
