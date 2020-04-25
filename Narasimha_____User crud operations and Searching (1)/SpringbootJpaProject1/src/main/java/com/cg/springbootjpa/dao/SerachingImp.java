package com.cg.springbootjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springbootjpa.model.Schedule;
import com.cg.springbootjpa.model.Search;
@Repository
public class SerachingImp implements Searching{
	
    @PersistenceContext
    EntityManager entityManager;

	@Override
	   public List<Schedule> searchScheduledFlights(Search search){
		   
	     String str="SELECT schedule from Schedule schedule WHERE :dDate=schedule.DepartureTime AND :sAirport=schedule.sourceAirport AND :dAirport=schedule.destinationAirport";
	     TypedQuery<Schedule> query=entityManager.createQuery(str,Schedule.class);
	     query.setParameter("dDate", search.DeparturTime);
	     query.setParameter("sAirport", search.sourceAirport);
	     query.setParameter("dAirport", search.destinationAirport);
	     List<Schedule> list=query.getResultList();
	     return list;
	     
	   
  }

}
