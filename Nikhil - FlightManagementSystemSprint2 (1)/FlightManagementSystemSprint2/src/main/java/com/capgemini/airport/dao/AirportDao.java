package com.capgemini.airport.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.airport.entity.Airport;
import com.capgemini.airport.exception.AirportException;

@Repository
public class AirportDao implements AirportDaoInterface {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void addAirportDao(Airport airport) {
		em.persist(airport);
	}

	@Override
	public List<Airport> findAll() {
		Query query = em.createQuery("SELECT airport FROM Airport as airport");	
		 List<Airport> all=query.getResultList();
		return all;
	}

	@Override
	public Airport findByCode(String airportCode) {
		return em.find(Airport.class,airportCode);	
	}

	@Override
	public void deleteByCode(String airportCode) {
		Airport airport=em.find(Airport.class,airportCode);
		if(airport == null)
			throw new AirportException("No Such AirportCode Found To Delete !!");
		else
			em.remove(airport);
			em.flush();
	}

	@Override
	public void update(String airportCode, String airportName, String airportLocation) {
		Airport airport = em.find(Airport.class,airportCode);
		if(airport == null)
		{
			throw new AirportException("No Airport With Entered AirportCode Is Found To Update !!");
		}
		else
		{
			airport.setAirportName(airportName);
			airport.setAirportLocation(airportLocation);
		}
	}
}
