package com.hda.math.misc.numtheory;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import com.hda.math.misc.utils.DivisorUtils;

public class AmicableNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int upperBoundLimit = 20000000;
		int upperNum = 0; // hold an upper bound limit
		Scanner scanner = new Scanner(System.in);
		System.out.println("Print Amicable Numbers(i.e intergers only) up to an integer limit: ");
		System.out.println("Please enter the limit(i.e an upper bount integer): ");
		upperNum = scanner.nextInt();
		Instant start = Instant.now();       
		if(upperNum <= upperBoundLimit) {
			DivisorUtils.printAmicableNumber(upperNum);
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
	
			System.out.println("Using limit: "+upperNum+", Done in " + timeElapsed + " ms");
		}
		else
			System.out.println("Sorry only accept limit <= 20000000");
	}

}
