package com.senyume.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jigish Patel
 */

public class Transformation {

	final List< String > friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

	// transform list of friends' names to an uppercase list
	// we don't want to replace names in existing list because:
	// -- original list will be lost
	// -- cannot modify immutable lists
	// -- hard to parallelize computations

	// old way -- external iterator
	public void transformOldWay1(){
		final List<String> upperCaseNames = new ArrayList<String>();
		for(String friend: friends){
			upperCaseNames.add(friend.toUpperCase());
		}
		System.out.println(upperCaseNames);
	}

	// internal iterator but we had to create the empty list and add elements
	public void transformNewWay1(){
		final List<String> upperCaseNames = new ArrayList<String>();
		friends.forEach( friend ->
							 upperCaseNames.add(friend.toUpperCase()));
		System.out.println(upperCaseNames);
	}

	// using Stream interface - Stream is much like an iterator and provides some nice functions
	// map function of stream interface - map or transform a sequence of input to a sequence of output
	// stream available on all collections in JDK 8
	// map method runs lambda expression on each element, collects result and returns the result collection
	// map ensures that both input and output collection have same number of elements
	public void transformNewWay2(){
		friends.stream()
				.map(friend -> friend.toUpperCase())
				.forEach(friend -> System.out.print(friend + " "));
		System.out.println();
	}

	// map can take a collection of one data type and return a collection of a different data type
	// for e.g. return number of characters for each name in the list
	// with lambda expressions, we do not need an initial empty list or explicit garbage variable
	public void countCharactersInName(){
		friends.stream()
				.map(friend -> friend.length())
				.forEach(count -> System.out.print(count + " "));
		System.out.println();
	}

	// use method reference (of method toUpperCase) instead of lambda expression (slightly shorter)
	public void transformNewWay3(){
		friends.stream()
				.map(String::toUpperCase)
				.forEach(friend -> System.out.print(friend + " "));
		System.out.println();

	}

}
