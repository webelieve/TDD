package com.we.code.tdd.median;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MedianTest2 {

	private Median median;
	
	@Before
	public void setUp() {
		median = new Median();
	}
	
	@Test
	public void evenNumberElementsTest() {
		int[] array1 = new int[]{1, 2, 3, 4};
		int[] array2 = new int[]{5, 6, 7, 8};
		
		double medianNum = median.findMedianSortedArrays(array1, array2);
		
		assertEquals(4.5, medianNum, 2);
	}
	
	@Test
	public void oldNumberElementsTest() {
		int[] array1 = new int[]{1, 2, 3, 4};
		int[] array2 = new int[]{6, 7, 8};
		
		double medianNum = median.findMedianSortedArrays(array1, array2);
		
		assertEquals(4, medianNum, 1);
	}
	
}
