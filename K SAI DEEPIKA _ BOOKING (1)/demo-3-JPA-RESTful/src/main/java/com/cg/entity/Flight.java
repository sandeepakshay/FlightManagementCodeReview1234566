package com.cg.entity;
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
	        
	        public Flight() {}
	        
	        public Flight(long FlightNumber) {
	        	
	        	this.FlightNumber=FlightNumber;
	        }
	        
	        public Flight(long FlightNumber,String carrierName,String flightModel,int seatCapacity) {
	        	
	        	
	        	    this.FlightNumber=FlightNumber;
	        	    this.carrierName=carrierName;
	        	    this.flightModel=flightModel;
	        	    this.seatCapacity=seatCapacity;
	        	    
	        }
	        
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
