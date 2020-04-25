package com.capgemini.project.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.project.entities.Schedule;
import com.capgemini.project.entities.ScheduledFlight;
import com.capgemini.project.entities.Users;
import com.capgemini.project.exceptions.AirportException;
import com.capgemini.project.exceptions.FlightException;
import com.capgemini.project.exceptions.ScheduleException;
import com.capgemini.project.services.ScheduleService;
import com.capgemini.project.services.ScheduleServiceImp;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Controller {

	        @Autowired
	        ScheduleService service;
	        
	        @PostMapping("/addSchedule")
	        public ResponseEntity<Object> adding(@Valid @RequestBody Schedule schedule){
	        	
	        	  
	        	    service.add(schedule);
	        	    return new ResponseEntity<>("You have scheduled a new flight",HttpStatus.OK);
	        }
	        
//	        @PostMapping("/addScheduled")
//	        public ResponseEntity<Object> added(@RequestBody ScheduledFlight scheduleflight){
//	        	
//	        	    service.addScheduled(scheduleflight);
//	        	    return new ResponseEntity<>("You have scheduled a new flight",HttpStatus.OK);
//	        }
//	       
	        
	        @GetMapping("/viewAirport")
	        public ResponseEntity<Object> displayAirport(){
	        	
	        	if(service.viewAirport()==null)
	        		throw new AirportException("No Airports Available");
	        	else
	        	    return new ResponseEntity<>(service.viewAirport(),HttpStatus.OK);
	        }
	        
	        
	        @GetMapping("/viewFlight")
	        public ResponseEntity<Object> displayFlight(){
	        	
	        	    if(service.viewFlight()==null)
	        	    	 throw new FlightException("No Flights Added");
	        	    else
	        	      return new ResponseEntity<>(service.viewFlight(),HttpStatus.OK);
	        }
	        
	        
	        @GetMapping("/viewSchedule")
	        public ResponseEntity<Object> displaySchedule(){
	        	
	        	    return new ResponseEntity<>(service.viewSchedule(),HttpStatus.OK);
	        }
	        
	        
	        @GetMapping("/viewAllSchedule")
	        public ResponseEntity<Object> displayAllSchedule(){
	        	
	        	     return new ResponseEntity<>(service.viewAllSchedule(),HttpStatus.OK);
	        }
	        
	        
	        
	        @GetMapping("/viewById/{id}")
	        public ResponseEntity<Object> displayById(@PathVariable("id") int id){
	        	
	        	    if(service.findById(id)==null)
	        	    	throw new ScheduleException("No Scheduled flight with entered ID is found");
	        	    else
	        	       return new ResponseEntity<>(service.findById(id),HttpStatus.OK);
	        }
	        
	        
	        
	        @PutMapping("/update/{id}")
	        public ResponseEntity<Object> update(@PathVariable("id") int id,@RequestBody Schedule schedule){
	        	
	        	       service.update(id, schedule);
	        	       return new ResponseEntity<>("updated",HttpStatus.OK);
	        }
	        
	        
	        @DeleteMapping("/delete/{id}")
	        public ResponseEntity<Object> delete(@PathVariable("id") int id){
	        	
	        	
	        	    service.delete(id);
	        	   return new ResponseEntity<>("Deleted",HttpStatus.OK);
	        	
	        	     
	        }
	        
	       
	        
	        
}
