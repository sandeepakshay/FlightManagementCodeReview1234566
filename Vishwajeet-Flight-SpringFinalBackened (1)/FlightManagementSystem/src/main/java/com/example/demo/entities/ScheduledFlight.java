package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="ScheduledFlight")
public class ScheduledFlight implements Serializable{
	
	           
	           @Id
	           @JoinColumn(name="flight",referencedColumnName="flightNumber")
	           @ManyToOne(optional=false)
	           @Autowired
	           Flight flight;
	           
	           int availableSeats;
	           
	           @Autowired
	           @ManyToOne
	           @JoinColumn(name="sourceAirport",referencedColumnName="ArivvalAirportCode")
	           Schedule schedule;
	           
	           
	           
              public ScheduledFlight(Flight flight,int availableSeats,Schedule schedule) {
            	  
            	  this.flight=flight;
            	  this.availableSeats=availableSeats;
            	  this.schedule=schedule;
            	  
              }

			public Flight getFlight() {
				return flight;
			}

			public void setFlight(Flight flight) {
				this.flight = flight;
			}

			public int getAvailableSeats() {
				return availableSeats;
			}

			public void setAvailableSeats(int availableSeats) {
				this.availableSeats = availableSeats;
			}

			public Schedule getSchedule() {
				return schedule;
			}

			public void setSchedule(Schedule schedule) {
				this.schedule = schedule;
			}
              
              
}
