package com.senyume.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jigish Patel
 */

public class Iteration {

	final List< String > friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

	public void iterateOldWay(){
		for(int i=0; i<friends.size(); i++){
			System.out.println(friends.get(i));
		}
	}

	public void iterateOldWay2(){
		for(String friend: friends){
			System.out.println(friend);
		}
	}
}
