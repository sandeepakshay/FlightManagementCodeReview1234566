package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Booking;

@Repository
public interface BookingService {
	public Booking addBookingService(Booking  booking);
	
	public List<Booking> viewBooking();
		
	public boolean cancelBookingService(int bookingId);
	
}
