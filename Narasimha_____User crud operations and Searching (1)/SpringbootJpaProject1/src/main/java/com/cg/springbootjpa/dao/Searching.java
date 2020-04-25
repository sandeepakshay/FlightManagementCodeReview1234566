package com.cg.springbootjpa.dao;

import java.util.List;

import com.cg.springbootjpa.model.Schedule;
import com.cg.springbootjpa.model.Search;



public interface Searching {
	public List<Schedule> searchScheduledFlights(Search search);

}
