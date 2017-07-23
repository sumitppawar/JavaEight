package com.sumit.learn.java8;

import java.time.Duration;
import java.time.Instant;
/*
 * New java time API classes are immutable and
 * Cab be shared among thread
 * NO zero based api now 1 means Jan , in java zero  means Jan 
 */
public class UseIntanceAndDurationTimeApi {

	public static void main(String[] args) throws InterruptedException {
		
		Instant start = Instant.now();
		System.out.println("Start time is " + start);
		
		Thread.sleep(1000);
		
		Instant end = Instant.now();
		System.out.println("End time is " + end);
		
		Duration difference = Duration.between(start, end);
		System.out.println("Difference is " + difference.getSeconds() + " seconds");
		
	}

}
