package com.we.code.tdd.convert;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringToIntegerTest {
	
	//atoi - Ascii to Integer
	private StringToInteger convertor;

	@Before
	public void setUp() {
		convertor = new StringToInteger();
	}
	
	@Test
	public void testConvertEmptyString() {
		String emptyString = "";
        int result = convertor.atoi(emptyString);
        assertEquals(0, result);
	}
	
	@Test 
	public void testConvertNullString() {
		String nullString = null;
		int result = convertor.atoi(nullString);
		assertEquals(0, result);
	}
	
	@Test
	public void testConvertZeroNumber() {
		String oneNumber = "0";
		int result = convertor.atoi(oneNumber);
		assertEquals(0, result);
	}
	
	@Test
	public void testConvertNotZeroNumber() {
		String number = "1";
		int result = convertor.atoi(number);
		assertEquals(1, result);
	}
	
	@Test
	public void testNotNumberInString() {
		String string = "!%122 ";
		//int result = convertor.atoi(string);
		//assertEquals(122, result);
	}

}
