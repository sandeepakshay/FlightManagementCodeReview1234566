package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.Flight;

public interface FlightDao {
	
    public List<Flight> findAll();
	
	public Flight findByFlightNumber(long theFlightNumber);
	
	public void save(Flight theFlight);
	
	public void deleteByFlightNumber(long theFlightNumber);

}
