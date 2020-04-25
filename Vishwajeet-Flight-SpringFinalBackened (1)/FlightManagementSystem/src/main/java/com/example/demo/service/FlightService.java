package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Flight;

public interface FlightService {
	
	 public List<Flight> findAll();
		
		public Flight findByFlightNumber(long theFlightNumber);
		
		public void save(Flight theFlight);
		
		public void deleteByFlightNumber(long theFlightNumber);

}
