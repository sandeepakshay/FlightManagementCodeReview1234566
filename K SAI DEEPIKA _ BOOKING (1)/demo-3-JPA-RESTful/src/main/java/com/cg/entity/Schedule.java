package com.cg.entity;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Schedule")
public class Schedule implements Serializable{
	
	      
	      @Id
	      public int ScheduleId;
	
	
	      @ManyToOne
	      @JoinColumn(name="SourceAirportCode",referencedColumnName="AirportCode")
	      @Autowired
	      public Airport sourceAirport;
	      
	       @ManyToOne
	       @JoinColumn(name="DestAirportCode",referencedColumnName="AirportCode")
		   @Autowired
	       public Airport destinationAirport;
	       
	       
	     
		   public Date ArrivalTime;
	       public Date DepartureTime;
	       
	      public Schedule(int ScheduledId) {
	    	  
	    	   this.ScheduleId=ScheduleId;
	      }
	     public Schedule(int ScheduleId,Airport sourceAirport,Airport destinationAirport,Date ArrivalTime,Date DepartureTime) {
	    	 
	    	          this.ScheduleId=ScheduleId;
	    	          this.sourceAirport=sourceAirport;
	    	          this.destinationAirport=destinationAirport;
	    	          this.ArrivalTime=ArrivalTime;
	    	          this.DepartureTime=DepartureTime;
	     }
	       
	    
	     public int getScheduleId() {
				return ScheduleId;
			}



			public void setScheduleId(int scheduleId) {
				ScheduleId = scheduleId;
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
		public Date getArrivalTime() {
			return ArrivalTime;
		}
		public void setArrivalTime(Date arrivalTime) {
			ArrivalTime = arrivalTime;
		}
		public Date getDepartureTime() {
			return DepartureTime;
		}
		public void setDepartureTime(Date departureTime) {
			DepartureTime = departureTime;
		}
	       
	       

}
