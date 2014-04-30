package com.we.code.tdd.median;

import java.util.Arrays;

public class Median {

	public double findMedianSortedArrays(int[] array1, int[] array2) {
		double medianNumber = 0.0;
		
//		int length = array1.length + array2.length;
		
		int[] array1and2 = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, array1and2, 0, array1.length);
		System.arraycopy(array2, 0, array1and2, array1.length, array2.length);
				
		Arrays.sort(array1);
		
		int extendedLength = array1and2.length + 1;
		double medianIndex = Math.floor(extendedLength/2);
		
		if ((array1and2.length)%2 == 0) {					
			int a = array1and2[(int) medianIndex-1];
			int b = array1and2[(int) (medianIndex)];
			
			medianNumber = (a + b) / 2;
		}
		else {
			medianNumber = array1and2[(int)medianIndex-1];
		}
		
		return medianNumber;
	}

}
