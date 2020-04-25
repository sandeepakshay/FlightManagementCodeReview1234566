package com.cg.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.entity.Booking;
import com.cg.exception.BookingException;
import com.cg.service.BookingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookingController {
	@Autowired
	private BookingService bookingservice;
	
	
	
	@PostMapping("/addbooking")
	public ResponseEntity<String> saveBook(@RequestBody Booking booking) 
	{
		if(booking.getNoOfPassengers()>5)throw new BookingException("No of Passengers should be less than 5");
		Booking book = bookingservice.addBookingService(booking);
		return new ResponseEntity<String>("Booking got added.", HttpStatus.OK);
	}
	

	
	

	@GetMapping("/viewBooking")
	public ResponseEntity<List<Booking>> viewAllBooking() 
	{
		List<Booking> view = bookingservice.viewBooking();
		return new ResponseEntity<List<Booking>>(view, HttpStatus.OK);
	}

	
	


	
	
	
	@DeleteMapping("/cancelBooking/{id}")
	public ResponseEntity<Boolean> cancelBooking1(@PathVariable("id") int bookingId)
	{
		Boolean status = bookingservice.cancelBookingService(bookingId);
		//throw exception if booking id is not present
				if(!status)throw new BookingException("Booking not found.");
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
	}
	
	
}




