package com.capgemini.airport.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AirportExceptionController {
	
	
	
	@ExceptionHandler(value={AirportException.class})
	public ResponseEntity<Object> exception(AirportException exception){
		
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.OK);
		
	}
	
}	
