package com.we.code.tdd.twosum;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {
	private Solution solution;
	private int[] numbers;
	private int target;
	
	@Before
	public void setUp() {
		solution = new Solution();	
	}
	  

	@Test
	public void NotFoundTest() {
		numbers = new int[]{2, -2, 4, 5, 3, 7};
		target = 20;
		Integer[] indexes = solution.twoSum(numbers, target);
		assertEquals(0, indexes.length);
	}
	
	@Test
	public void foundTest() {
		numbers = new int[]{2, 0, -2, 4, 5, 8, 9, 7};
		target = 8;
		Integer[] indexes = solution.twoSum(numbers, target);
		assertEquals(2, indexes.length);
		Integer[] expectedIndexes = new Integer[]{2,6};
		assertArrayEquals(expectedIndexes, indexes);
	}
	
	@Test
	public void maxIntTest() {
		numbers = new int []{10, Integer.MAX_VALUE};
		int target = -1;
		
		Integer[] results = solution.twoSum(numbers, target);
		
		Integer[] expectedResult = new Integer[]{1,2};
		
		
		
	}
}
