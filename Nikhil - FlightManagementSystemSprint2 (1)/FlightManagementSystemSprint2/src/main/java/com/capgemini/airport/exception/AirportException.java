package com.capgemini.airport.exception;

public class AirportException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public AirportException(String msg) {
		
		super(msg);
	}

}
