package com.cg.springbootjpa.exception;

public class UserTypeException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public UserTypeException(String mesg)
	{
		super(mesg);
	}
}
