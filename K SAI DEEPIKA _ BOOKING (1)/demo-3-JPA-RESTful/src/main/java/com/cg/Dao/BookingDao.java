package com.cg.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Booking;

@Repository
public interface BookingDao /*extends JpaRepository <Booking,Integer>*/
{
	public boolean cancelBooking(int bookingId);
	
	public  void addBooking(Booking bookingList);

	public List<Booking> viewBooking() ;
}
