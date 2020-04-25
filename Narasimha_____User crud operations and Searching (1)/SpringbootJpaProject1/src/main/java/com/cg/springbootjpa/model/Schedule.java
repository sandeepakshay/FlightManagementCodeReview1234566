package com.cg.springbootjpa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Schedule")
public class Schedule implements Serializable{
	
	      
	      @Id
	      @NotNull(message="Schedule id is mandatory")
	      public int ScheduleId;
	
	
	      @ManyToOne
	      @JoinColumn(name="SourceAirportCode",referencedColumnName="AirportCode")
	      @Autowired
	      public Airport sourceAirport;
	      
	       @ManyToOne
	       @JoinColumn(name="DestAirportCode",referencedColumnName="AirportCode")
		   @Autowired
	       public Airport destinationAirport;
	       
	       
	      
	       @NotNull(message="you must enter time")
		   public String ArrivalTime;
	       public String DepartureTime;
	       
	       
           @JoinColumn(name="flight",referencedColumnName="FlightNumber")
           @ManyToOne(optional=false)
           @Autowired
           Flight flight;
           
           int availableSeats;

	       
	       
	       
	       
	       	       
	       
	       public Schedule() {}
	       
	      public Schedule(int ScheduledId) {
	    	  
	    	   this.ScheduleId=ScheduleId;
	    	   
	      }
	     public Schedule(int ScheduleId,Airport sourceAirport,Airport destinationAirport,String ArrivalTime,String DepartureTime,Flight flight,int availableSeats) {
	    	 
	    	          this.ScheduleId=ScheduleId;
	    	          this.sourceAirport=sourceAirport;
	    	          this.destinationAirport=destinationAirport;
	    	          
	    	          this.ArrivalTime=ArrivalTime;
	    	          this.DepartureTime=DepartureTime;
	    	          this.flight=flight;
	    	          this.availableSeats=availableSeats;
	    	         
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

		public int getScheduleId() {
				return ScheduleId;
			}



			public void setScheduleId(int scheduleId) {
				this.ScheduleId = scheduleId;
			}
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
		public String getArrivalTime() {
			return ArrivalTime;
		}
		
		public void setArrivalTime(String arrivalTime) {
			ArrivalTime = arrivalTime;
		}
		
		public String getDepartureTime() {
			return DepartureTime;
		}
		public void setDepartureTime(String departureTime) {
			this.DepartureTime = departureTime;
		}
	       
	       

}

