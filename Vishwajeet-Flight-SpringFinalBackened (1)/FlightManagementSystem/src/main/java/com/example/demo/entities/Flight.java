package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
public class Flight implements Serializable {
	
	    
			@Id
	        long FlightNumber;
	        String carrierName;
	        String flightModel;
	        int seatCapacity;
	        
	        
			public long getFlightNumber() {
				return FlightNumber;
			}
			public void setFlightNumber(long flightNumber) {
				FlightNumber = flightNumber;
			}
			public String getCarrierName() {
				return carrierName;
			}
			public void setCarrierName(String carrierName) {
				this.carrierName = carrierName;
			}
			public String getFlightModel() {
				return flightModel;
			}
			public void setFlightModel(String flightModel) {
				this.flightModel = flightModel;
			}
			public int getSeatCapacity() {
				return seatCapacity;
			}
			public void setSeatCapacity(int seatCapacity) {
				this.seatCapacity = seatCapacity;
			}
	        

}
