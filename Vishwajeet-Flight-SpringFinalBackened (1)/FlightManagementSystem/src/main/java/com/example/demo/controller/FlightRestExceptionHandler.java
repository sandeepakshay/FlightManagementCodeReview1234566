package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FlightRestExceptionHandler {
	
	//Add an exception handler for FlightNotFoundException
	@ExceptionHandler
	public ResponseEntity<FlightErrorResponse> handleException(FlightNotFoundException exc)
	{ 
		//create FlightErrorResponse
		FlightErrorResponse error=new FlightErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				exc.getMessage(),
				System.currentTimeMillis()
				);			
		//return ResponseEntity
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	//Add another exception handler to catch any exception (catch all)

	@ExceptionHandler
	public ResponseEntity<FlightErrorResponse> handleException(Exception exc)
	{ 
		//create FlightErrorResponse
		FlightErrorResponse error=new FlightErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				exc.getMessage(),
				System.currentTimeMillis()
				);			
		//return ResponseEntity
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
}
