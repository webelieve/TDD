package com.we.code.tdd.reverse;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseIntegerTest {
	
	private ReverseInteger reverse;

	@Before
	public void setUp() {
		reverse = new ReverseInteger();
	}
	
	@Test
	public void testOneDigitPostiveNumber() {
		int number = 1;
		int result = reverse.reverse(number);
		assertEquals(1, result);
	}
	
	@Test
	public void testMoreThanOneDigitPositiveNumber() {
		int number = 234;
		int result = reverse.reverse(number);
		assertEquals(432, result);
	}
	
	@Test
	public void testOneDigitNegativeNumber() {
		int number = -1;
		int result = reverse.reverse(number);
		assertEquals(-1, result);
	}
	
	@Test
	public void testMoreThanOneDigitNegativeNumber() {
		int number = -234;
		int result = reverse.reverse(number);
		assertEquals(-432, result);
	}
	
	@Test
	public void testZeroLeadingDigitNumber() {
		int number = 200;
		int result = reverse.reverse(number);
		assertEquals(2, result);
	}
	
	@Test
	public void testOverFlowNumber() {
		int number = 1000000003;
		int result = reverse.reverse(number);
		assertEquals(Integer.MAX_VALUE, result);
	}

}
