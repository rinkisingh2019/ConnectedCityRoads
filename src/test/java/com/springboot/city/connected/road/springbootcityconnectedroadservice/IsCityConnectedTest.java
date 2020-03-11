package com.springboot.city.connected.road.springbootcityconnectedroadservice;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;


class IsCityConnectedTest {

	
	@Test	  
		  void isBostonNewyorkConnected() {
				FindCitiesConnected service = new FindCitiesConnected();
			    assertEquals("Yes", service.isCitiesConnected("Boston", "NewYork"));
		
		}
	
	@Test	  
	void isBostonPhilyConnected() {
			FindCitiesConnected service = new FindCitiesConnected();
		 
		   assertEquals("Yes", service.isCitiesConnected("Boston", "Philadelphia"));
	
	}
	
	@Test	  
	void isPhilyAlbaniConnected() {
			FindCitiesConnected service = new FindCitiesConnected();
		   assertEquals("No", service.isCitiesConnected("Philadelphia", "Albany"));
	
	}

}
