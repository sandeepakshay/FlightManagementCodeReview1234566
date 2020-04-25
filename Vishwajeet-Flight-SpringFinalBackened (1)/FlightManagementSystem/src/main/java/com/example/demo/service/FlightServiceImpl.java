package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.FlightDao;
import com.example.demo.entities.Flight;
@Service
public class FlightServiceImpl implements FlightService {
	
	private FlightDao flightDao;
	
	
    @Autowired
	public FlightServiceImpl(@Qualifier("flightDaoImpl") FlightDao theFlightDao) {
		flightDao = theFlightDao;
	}

	@Override
	@Transactional
	public List<Flight> findAll() {
		
		return flightDao.findAll();	
	}

	@Override
	@Transactional
	public Flight findByFlightNumber(long theFlightNumber) {
	
		return flightDao.findByFlightNumber(theFlightNumber);
	}

	@Override
	@Transactional
	public void save(Flight theFlight) {
		
		flightDao.save(theFlight);
	}

	@Override
	@Transactional
	public void deleteByFlightNumber(long theFlightNumber) {
		
		flightDao.deleteByFlightNumber(theFlightNumber);
	}

}
