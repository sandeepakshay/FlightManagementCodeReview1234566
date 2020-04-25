package com.cg.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	
	       public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	       long BookingId;
	       
	       
	     
	       @JoinColumn(name="userId",referencedColumnName="UserId")
	       @ManyToOne
	       @Autowired
	       public Users userId;
	       
	       Date Bookingdate;
	       @OneToMany(cascade=CascadeType.ALL)
	   	@JoinColumn(name="booking_id",referencedColumnName="bookingId")
	   	private List<Passenger> passenger= new ArrayList<Passenger>();
	       
	       double ticketCost;
	       
	       @ManyToOne
	       @Autowired
	       @JoinColumn(name="flightNum",referencedColumnName="flightNumber")
	       Flight flight;
	       
	       int noOfPassengers;

		public long getBookingId() {
			return BookingId;
		}

		public void setBookingId(long bookingId) {
			BookingId = bookingId;
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

		public List<Passenger> getPassenger() {
			return passenger;
		}

		public void setPassenger(List<Passenger> passenger) {
			this.passenger = passenger;
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

		public Booking(long bookingId, Users userId, Date bookingdate, List<Passenger> passenger, double ticketCost,
				Flight flight, int noOfPassengers) {
			BookingId = bookingId;
			this.userId = userId;
			Bookingdate = bookingdate;
			this.passenger = passenger;
			this.ticketCost = ticketCost;
			this.flight = flight;
			this.noOfPassengers = noOfPassengers;
		}
	       
	  
	       

}
