package com.senyume.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jigish Patel
 */

public class FindingElements {

	final List< String > friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

	public void startsWithNOldWay1(){
		final List< String > startsWithN = new ArrayList<String>();
		for(String friend: friends){
			if(friend.startsWith("N")){
				startsWithN.add(friend);
			}
		}
		System.out.println(startsWithN);
	}

	// filter method expects a lambda expression that returns a boolean
	// collect method is used to transform result into a list
	// filter(), just like map(), returns an iterator
	public void startsWithNNewWay1(){
		final List<String> startsWithN =
				friends.stream()
				.filter(friend -> friend.startsWith("N"))
				.collect(Collectors.toList());

	}

	public void printAllFriends(){
		System.out.println(friends);
	}

}
