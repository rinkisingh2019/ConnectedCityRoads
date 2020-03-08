package com.springboot.city.connected.road.springbootcityconnectedroadservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class CityRoadController {

	
	  String connected = "No";
	@GetMapping("/connected")
	@ResponseBody
	public String isCityConnected(@RequestParam String origin,@RequestParam String destination) {
		FindCitiesConnected service = new FindCitiesConnected();
		connected = service.isCitiesConnected(origin, destination);
		System.out.println( origin + " " +  destination  + " connected " + connected);

		
		return connected;
	}
}
	  