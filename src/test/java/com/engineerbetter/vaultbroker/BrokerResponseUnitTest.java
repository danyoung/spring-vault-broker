package com.engineerbetter.vaultbroker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrokerResponseUnitTest {
	
	   private BrokerResponse Broker;
		
	   @Test
	   public void testBrokerResponse() 
	   {
		  Broker = new BrokerResponse();
		  
	      assertEquals(Broker.getResponse(),"Hello!");
	   }	
	

}
 