package com.capgemini.project.Dao;

import java.util.List;

import com.capgemini.project.entities.Airport;
import com.capgemini.project.entities.Flight;
import com.capgemini.project.entities.Schedule;
import com.capgemini.project.entities.ScheduledFlight;

public interface ScheduleDao {

	
	       public void add(Schedule schedule);
	       
	       public void addScheduled(ScheduledFlight scheduleflight);
	       
	       
	       public List<Object> viewAirport();
	       
	       public List<Object> viewFlight();
	       
	       public List<Object> viewSchedule();
	       
	       public List<Schedule> viewAllSchedule();
	       
	       public void delete(int id);
	       
	       public void update(int id,Schedule schedule);
	       
	       public Schedule findById(int id);
	       
}

