package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Flight;

@Repository
public class FlightDaoImpl implements FlightDao {
	
    private EntityManager entityManager;
	
    @Autowired
	public FlightDaoImpl(EntityManager theentityManager) {
		this.entityManager = theentityManager;
	}

	@Override
	public List<Flight> findAll() {
		
		//create a query
		Query theQuery=entityManager.createQuery("from Flight");
		
		//execute query and get result list
		List<Flight> flights=theQuery.getResultList();
		return flights;
		
	}

	@Override
	public Flight findByFlightNumber(long theFlightNumber) {
		
		//get flight
		Flight theFlight=
				entityManager.find(Flight.class, theFlightNumber);
		
		//return flight
		return theFlight;
	}

	@Override
	public void save(Flight theFlight) {
		
		//save or update the employee
		Flight dbFlight=entityManager.merge(theFlight);
		
		//update with flightNumber from db... so we can get generated flightNumber for save/insert
        theFlight.setFlightNumber(dbFlight.getFlightNumber());		
	}

	@Override
	public void deleteByFlightNumber(long theFlightNumber) {
		
		Query theQuery=entityManager.createQuery("delete from Flight where FlightNumber=:flightNumber");
		theQuery.setParameter("flightNumber", theFlightNumber);
		theQuery.executeUpdate();
		
		
	}

}
