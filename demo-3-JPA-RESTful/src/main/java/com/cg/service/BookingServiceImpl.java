package com.cg.service;

import java.util.List;
//
import javax.transaction.Transactional;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.BookingDao;
//
import com.cg.entity.Booking;

@Transactional
@Service
public class BookingServiceImpl implements BookingService
{

	@Autowired
	private BookingDao bookingdao;

	
	
	@Override
	public Booking addBookingService(Booking booking) 
	{
		// TODO Auto-generated method stub
		bookingdao.addBooking(booking);
		return booking;
	}

	
	
	
	@Override
		public List<Booking> viewBooking() {
			// TODO Auto-generated method stub
			return bookingdao.viewBooking();
	}
	
	
	
	
	@Override
	public boolean cancelBookingService(int bookingId)
	{
		// TODO Auto-generated method stub
		return bookingdao.cancelBooking(bookingId);
	
	}

}
