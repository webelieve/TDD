package com.we.code.tdd.stringcalculator.exception;

public class NegativeNumberException extends RuntimeException {

	private static final long serialVersionUID = 1167037705243822165L;
	
	private String errorMessage;
	
	public NegativeNumberException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
