package com.senyume.java8;

/**
 * @author Jigish Patel
 */

public class Application {
	public static void main(String[] args){
		System.out.println("Testing Java 8 Time API");

		// to show basic formatting and manipulating date-time mixed with timezones
		CoreClasses coreClasses = new CoreClasses();
		System.out.println("-------------- flight example -------------");
		coreClasses.flightExample();

		// to show use of temporal adjusters
		TemporalClasses temporalClasses = new TemporalClasses();
		System.out.println("-------------- holidays example -----------");
		// to show use of temporal adjusters
		temporalClasses.holidaysExample();
	}
}
