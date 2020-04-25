package com.cg.springbootjpa.service;

import java.util.List;

import com.cg.springbootjpa.model.Schedule;
import com.cg.springbootjpa.model.Search;



public interface SearchingService {
	public List<Schedule> searchScheduledFlights(Search search);

}
