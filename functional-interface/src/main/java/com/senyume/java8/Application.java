package com.senyume.java8;

import com.senyume.java8.functional.IAdd;

/**
 * @author Jigish Patel
 */

public class Application {

	public static void main(String[] args){
		
		System.out.println("Functional interface demo application ...");
		
		// old (Java 7 and before) way of implementing the interface using Anonymous Inner Class
		IAdd<Integer> addIntegerOldWay = new IAdd<Integer>() {
			@Override
			public Integer add(Integer param1, Integer param2) {
				return param1 + param2;
			}
		};

		// new (Java 8) way using Lambda Expressions
		IAdd<Integer> addIntegerLambda = (x, y) -> x + y;
		IAdd<String> addStringLambda = (x,y) -> x + y;
		
		System.out.println("Adding integers old way (anonymous inner class): 5 + 7 = " + addIntegerOldWay.add(5, 7));
		System.out.println("Adding integers new way (with lambda): 5 + 7 = " + addIntegerLambda.add(5, 7));
		System.out.println("Adding strings new way (with lambda): 'abc' + 'jhk' = " + addStringLambda.add("abc", "jhk"));
	}

}
