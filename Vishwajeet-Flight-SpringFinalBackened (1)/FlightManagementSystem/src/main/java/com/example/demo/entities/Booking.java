package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Booking")
public class Booking implements Serializable{
	
	       @Id
	       long BokkingId;
	       
	       
	       @ManyToOne
	       @JoinColumn(name="userId",referencedColumnName="UserId")
	       @Autowired
	       public Users userId;
	       
	       Date Bookingdate;
	       
	       @OneToMany(targetEntity=Passenger.class)  
	       List<Passenger> passengersList;
	       
	       double ticketCost;
	       
	       @ManyToOne
	       @Autowired
	       @JoinColumn(name="flightNum",referencedColumnName="flightNumber")
	       Flight flight;
	       
	       int noOfPassengers;
	       
	       
	   public Booking(long BookingId,Users userId,Date Bookingdate,List<Passenger> passengerList,double ticketCost,Flight flight,int noOfPassengers) {
		   
		   
		       this.BokkingId=BookingId;
		       this.userId=userId;
		       this.Bookingdate=Bookingdate;
		       this.passengersList=passengersList;
		       this.flight=flight;
		       this.noOfPassengers=noOfPassengers;
		   
		 		   
	   }

		public long getBokkingId() {
			return BokkingId;
		}

		public void setBokkingId(long bokkingId) {
			BokkingId = bokkingId;
		}

		public Users getUserId() {
			return userId;
		}

		public void setUserId(Users userId) {
			this.userId = userId;
		}

		public Date getBookingdate() {
			return Bookingdate;
		}

		public void setBookingdate(Date bookingdate) {
			Bookingdate = bookingdate;
		}

		public List<Passenger> getPassengersList() {
			return passengersList;
		}

		public void setPassengersList(List<Passenger> passengersList) {
			this.passengersList = passengersList;
		}

		public double getTicketCost() {
			return ticketCost;
		}

		public void setTicketCost(double ticketCost) {
			this.ticketCost = ticketCost;
		}

		public Flight getFlight() {
			return flight;
		}

		public void setFlight(Flight flight) {
			this.flight = flight;
		}

		public int getNoOfPassengers() {
			return noOfPassengers;
		}

		public void setNoOfPassengers(int noOfPassengers) {
			this.noOfPassengers = noOfPassengers;
		}
	       
	       
	       
	       
	       

}
