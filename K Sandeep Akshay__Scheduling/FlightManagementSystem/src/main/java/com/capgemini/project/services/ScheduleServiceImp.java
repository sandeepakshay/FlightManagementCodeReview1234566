package com.capgemini.project.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capgemini.project.Dao.ScheduleDao;
import com.capgemini.project.Dao.ScheduleDaoImp;
import com.capgemini.project.entities.Airport;
import com.capgemini.project.entities.Flight;
import com.capgemini.project.entities.Schedule;
import com.capgemini.project.entities.ScheduledFlight;
import com.capgemini.project.entities.Users;


@Transactional
@Service
public class ScheduleServiceImp implements ScheduleService {

	
	         @Autowired
	         ScheduleDao dao;
	         
	         public void add(Schedule schedule) {
	        	 
	        	    dao.add(schedule);
	         }
	         
	         public void addScheduled(ScheduledFlight scheduleflight) {
	        	 
	        	     dao.addScheduled(scheduleflight);
	         }
	         
	         public List<Object> viewAirport() {
	        	 
	        	 
	        	  return dao.viewAirport();
	         }
	         
	         public List<Object> viewFlight(){
	        	 
	        	   return dao.viewFlight();
	         }
	         
	         public List<Object> viewSchedule(){
	        	 
	        	    return dao.viewSchedule();
	         }
	         
	         public List<Schedule> viewAllSchedule(){
	        	 
	        	   return dao.viewAllSchedule();
	         }
	         
	         public void delete(int id) {
	        	 
	        	    dao.delete(id);
	         }
	         
	         public void update(int id,Schedule schedule) {
	        	 
	        	      dao.update(id, schedule);
	         }
		       
		       public Schedule findById(int id) {
		    	   
		    	        return dao.findById(id);
		       }
	      
	          
	   
}
