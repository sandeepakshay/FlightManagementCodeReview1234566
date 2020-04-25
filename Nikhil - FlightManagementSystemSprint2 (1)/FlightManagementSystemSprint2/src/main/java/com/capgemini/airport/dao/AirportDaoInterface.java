package com.capgemini.airport.dao;

import java.util.List;

import com.capgemini.airport.entity.Airport;

public interface AirportDaoInterface {
	public void addAirportDao(Airport airport);
	List<Airport> findAll();
	Airport findByCode(String airportCode);
	public void deleteByCode(String airportCode);
	public void update(String airportCode, String airportName, String airportLocation);

}
