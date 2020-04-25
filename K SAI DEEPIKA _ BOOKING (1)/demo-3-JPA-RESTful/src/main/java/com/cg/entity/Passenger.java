package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passenger")
public class Passenger implements Serializable {
	
	          @Id
	          @GeneratedValue(strategy = GenerationType.IDENTITY)
	          long pnrNumber;
	          String passengerName;
	          int passengerAge;
	          double luggage;
	          
	          
			public Passenger() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Passenger(long pnrNumber, String passengerName, int passengerAge, double luggage) {
				this.pnrNumber = pnrNumber;
				this.passengerName = passengerName;
				this.passengerAge = passengerAge;
				this.luggage = luggage;
			}
			public long getPnrNumber() {
				return pnrNumber;
			}
			public void setPnrNumber(long pnrNumber) {
				this.pnrNumber = pnrNumber;
			}
			public String getPassengerName() {
				return passengerName;
			}
			public void setPassengerName(String passengerName) {
				this.passengerName = passengerName;
			}
			public int getPassengerAge() {
				return passengerAge;
			}
			public void setPassengerAge(int passengerAge) {
				this.passengerAge = passengerAge;
			}
			public double getLuggage() {
				return luggage;
			}
			public void setLuggage(double luggage) {
				this.luggage = luggage;
			}
	          
	          
	      

}
