package com.we.code.tdd.stringcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.we.code.tdd.stringcalculator.exception.NegativeNumberException;

public class StringCalculatorTest {
	
	private StringCalculator calculator;
	
	@Rule
	public ExpectedException negativeNumberException = ExpectedException.none();
	
	@Before
	public void setUp() {
		calculator = new StringCalculator();
    }
	
/*	Given/Then/When style!
    @Test
	public void emptyStringShouldReturnZero() {
		givenAnEmptyString();
		thenExecuteStringCalcualtor();
		verifyZeroReturned();
	}
	
	private String givenAnEmptyString() {
		return "";		
	}

	private int thenExecuteStringCalcualtor() {
		return calculator.add(givenAnEmptyString());		
	}

	private void verifyZeroReturned() {
		assertEquals(0, thenExecuteStringCalcualtor());		
	}*/

	@Test
	public void shouldReturnZeroOnEmptyString() {
		String s = new String("");
		int result = calculator.add(s);		
		assertEquals(0, result);
	}
	
	@Test
	public void shouldReturnItselfWhenOnlyOneDigitNumber() {
		String s = new String("1");
		int result = calculator.add(s);
		assertEquals(Integer.parseInt(s), result);
	}
	
	@Test
	public void shouldSumWhenMoreThanOneNumber() {
		String s = new String("1,2");
		int result = calculator.add(s);
		assertEquals(3, result);
	}
	
	@Test
	public void shouldSumWhentNewlinesInString() {
		String numbers = "1\n2,3";
		int result = calculator.add(numbers);
		assertEquals(6, result);
	}
	
	@Test
	public void shouldSumWithAnyDelimitersInString() {
		String numbers = " 1\n2,|3,%^ *0#";
		int result = calculator.add(numbers);
		assertEquals(6, result);
	}
	
	@Test
	public void shouldThrowExceptionOnNegativeNumbers() {
		String numbers = "1, #$-2^3";
		negativeNumberException.expect(NegativeNumberException.class);       
		calculator.add(numbers);		
	}
	
	@Test
	public void shouldDisplayAllNegativeNumbersInExceptionMessage() {
		String numbers = "1, #$-2^-3";
		negativeNumberException.expect(NegativeNumberException.class);       
		negativeNumberException.expectMessage("Negative not allowed: -2 -3 ");	
		calculator.add(numbers);	
	}

}
