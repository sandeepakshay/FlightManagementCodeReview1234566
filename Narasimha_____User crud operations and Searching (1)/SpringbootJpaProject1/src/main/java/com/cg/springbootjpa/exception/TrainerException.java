package com.cg.springbootjpa.exception;

public class TrainerException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public TrainerException(String msg) {
		super(msg);
	}
}
