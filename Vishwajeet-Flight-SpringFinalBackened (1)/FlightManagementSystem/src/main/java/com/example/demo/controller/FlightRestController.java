package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Flight;
import com.example.demo.service.FlightService;

@RestController
@RequestMapping("/api")
public class FlightRestController {
	private FlightService flightService;
    @Autowired
	public FlightRestController(FlightService theFlightService) {
		super();
		this.flightService = theFlightService;
	}
    
    //expose "/flights" and return list of flights
    @GetMapping("/flights")
    public List<Flight> finalAll()
    {
    	return flightService.findAll();
    }
	 
    
    //add mapping for GET /flights/{flightNumber}
    @GetMapping("/flights/{theFlightNumber}")
    public Flight getFlight(@PathVariable long theFlightNumber) {
    	Flight theFlight=flightService.findByFlightNumber(theFlightNumber);
    	if(theFlight==null) {
    		throw new FlightNotFoundException("FlightNumber not found - " + theFlightNumber);
    	}
    	return theFlight;
    }
    
    //add mapping for POST /flights - add new flight
    @PostMapping("/flights")
    public Flight addFlight(@RequestBody Flight theFlight)
    {
    	//also just in case they pass an id in JSON ... set id to 0
    	//this is to force a save of new item ... instead of update
    	
    	theFlight.setFlightNumber(0);
    	flightService.save(theFlight);
    	return theFlight;
    }
    
    //add mapping for PUT /employees - update existing flight
    @PutMapping("/flights")
    public Flight updateFlight(@RequestBody Flight theFlight) {
    	 flightService.save(theFlight);
    	 return theFlight;
    }
    
    //add mapping for DELETE /flight/{flightNumber} - delete flight
    @DeleteMapping("/flights/{theFlightNumber}")
    public String deleteFlight(@PathVariable long theFlightNumber) {
    	
    	Flight tempFlight=flightService.findByFlightNumber(theFlightNumber);
    	//throw exception if null
    	if(tempFlight==null) {
    		throw new RuntimeException("Flight flightNumber not found - " + theFlightNumber);
    	}
    	flightService.deleteByFlightNumber(theFlightNumber);
    	return "Delete employee id - "+theFlightNumber;
    }
    
    
	

}




























