package com.capgemini.project.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ScheduleExceptionController {
	
	
	
	          @ExceptionHandler(value={ScheduleException.class})
	          public ResponseEntity<Object> exception(ScheduleException exception){
	        	  
	        	      return new ResponseEntity<>(exception.getMessage(),HttpStatus.OK);
	          }
	          
	          @ExceptionHandler(value={AirportException.class})
	          public ResponseEntity<Object> exception(AirportException exception){
	        	  
	        	      return new ResponseEntity<>(exception.getMessage(),HttpStatus.OK);
	          }
	          
	          @ExceptionHandler(value={FlightException.class})
	          public ResponseEntity<Object> exception(FlightException exception){
	        	  
	        	      return new ResponseEntity<>(exception.getMessage(),HttpStatus.OK);
	          }
	          
	          @ExceptionHandler(MethodArgumentNotValidException.class)
	      	public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
	      		Map<String, String> errors = new HashMap<>();

	      		ex.getBindingResult().getFieldErrors().forEach(error -> 
	      			errors.put(error.getField(), error.getDefaultMessage()));
	      		
	      		return errors;
	      	}

}
