package com.cg.springbootjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springbootjpa.dao.Searching;
import com.cg.springbootjpa.model.Schedule;
import com.cg.springbootjpa.model.Search;
@Transactional
@Service
public class SearchingServiceImp implements SearchingService{
	
	@Autowired
	Searching searching;

	@Override
	public List<Schedule> searchScheduledFlights(Search search) {
		// TODO Auto-generated method stub
		return searching.searchScheduledFlights(search);
	}
	

}
