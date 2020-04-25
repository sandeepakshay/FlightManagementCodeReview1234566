package com.capgemini.airport.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Airport")
public class Airport implements Serializable {
	
	    
	       String airportName;
	       @Id
	       String airportCode;
	       String airportLocation;
	       
	       
	       public Airport()
	       {
	    	   
	    	   
	       }
	       
	       
	    public Airport(String airportName,String airportCode,String airportLocation) {
	    	
	    	this.airportName=airportName;
	    	this.airportCode=airportCode;
	    	this.airportLocation=airportLocation;
	    	
	    	
	    }

		public String getAirportName() {
			return airportName;
		}

		public void setAirportName(String airportName) {
			this.airportName = airportName;
		}

		public String getAirportCode() {
			return airportCode;
		}

		public void setAirportCode(String airportCode) {
			this.airportCode = airportCode;
		}

		public String getAirportLocation() {
			return airportLocation;
		}

		public void setAirportLocation(String airportLocation) {
			this.airportLocation = airportLocation;
		}
}

