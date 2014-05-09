package com.we.code.tdd.stringcalculator.exception;

public class NegativeNumberException extends RuntimeException {

	private static final long serialVersionUID = 1167037705243822165L;
		
	public NegativeNumberException(String errorMessage) {
		super(errorMessage);
	}

}
