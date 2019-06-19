package com.hda.math.misc.utils;

import java.util.ArrayList;
import java.util.List;

public class DivisorUtils {

	public DivisorUtils() {
		super();
	}
	
	public static int sumOfProperDivisors(int x) {
		
		int sum = 1;
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if (x%i == 0)
				sum +=( i ==(x / i))? i : (i + x / i);
		}
		return sum;
	}
	
	public static void printAmicableNumber(int upperNum) {
		
		List<Integer> holdPairs = new ArrayList<Integer>();
		for(int i = 4; i < upperNum ; i++) {
			int sum1 = sumOfProperDivisors(i);
			if(sum1 < upperNum) {
				int sum2 = sumOfProperDivisors(sum1);
				if(sum2 == i  && i != sum1) {				
					if(!isInListOfAN(holdPairs, i) && !isInListOfAN(holdPairs, sum1)) {
						System.out.println("[" +i + "," + sum1 + "]");
						holdPairs.add(Integer.valueOf(i));
						holdPairs.add(Integer.valueOf(sum1));
				}
			}
		}
		
	}
		if (!holdPairs.isEmpty())
			System.out.println("Number of pairs found: " + (holdPairs.size()/2));
}
	//holding the list of amicable numbers pairs
	public static boolean isInListOfAN(List<Integer> list, int elm) {
		if(list.contains(Integer.valueOf(elm)))
			return true;
		return false;
	}
	
	
}
