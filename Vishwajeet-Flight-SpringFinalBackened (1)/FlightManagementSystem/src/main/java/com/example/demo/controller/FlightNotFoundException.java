package com.example.demo.controller;

public class FlightNotFoundException extends RuntimeException {

	public FlightNotFoundException() {
		
	}

	public FlightNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public FlightNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public FlightNotFoundException(String message) {
		super(message);
	}
		

	public FlightNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
