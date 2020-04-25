package com.capgemini.airport.service;

import java.util.List;

import com.capgemini.airport.entity.Airport;

public interface AirportServiceInterface {
	public void addAirport(Airport airport);
	List<Airport> findAll();
	Airport findByCode(String airportCode);
	public void deleteByCode(String airportCode);
	public void update(String airportCode, String airportName, String airportLocation);

}
