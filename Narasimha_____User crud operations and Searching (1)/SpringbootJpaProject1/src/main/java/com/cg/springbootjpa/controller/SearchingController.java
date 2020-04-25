package com.cg.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springbootjpa.exception.SearchNotFoundException;
import com.cg.springbootjpa.model.Search;
import com.cg.springbootjpa.service.SearchingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SearchingController {
	
	@Autowired
	SearchingService searching;
	
    @GetMapping("/search")
    public ResponseEntity<Object> search(@RequestBody Search search){
    	
    	    if(searching.searchScheduledFlights(search).isEmpty())
    	    	 throw new SearchNotFoundException("No Search Results!");
    	    else
    	       return new ResponseEntity<>(searching.searchScheduledFlights(search),HttpStatus.OK);
    	    
    }

}
