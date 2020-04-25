package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Schedule")
public class Schedule implements Serializable{
	
	      
	      @Id
	      @ManyToOne
	      @JoinColumn(name="ArivvalAirportCode",referencedColumnName="AirportCode")
	      @Autowired
	      Airport sourceAirport;
	      
	       @ManyToOne
	       @JoinColumn(name="DestAirportCode",referencedColumnName="AirportCode")
		   @Autowired
	       Airport destinationAirport;
	       
	       
	       Timestamp ArrivalTime;
	       Timestamp DepartureTime;
	       
	    
	   
		public Airport getSourceAirport() {
			return sourceAirport;
		}
		public void setSourceAirport(Airport sourceAirport) {
			this.sourceAirport = sourceAirport;
		}
		public Airport getDestinationAirport() {
			return destinationAirport;
		}
		public void setDestinationAirport(Airport destinationAirport) {
			this.destinationAirport = destinationAirport;
		}
		public Timestamp getArrivalTime() {
			return ArrivalTime;
		}
		public void setArrivalTime(Timestamp arrivalTime) {
			ArrivalTime = arrivalTime;
		}
		public Timestamp getDepartureTime() {
			return DepartureTime;
		}
		public void setDepartureTime(Timestamp departureTime) {
			DepartureTime = departureTime;
		}
	       
	       

}
