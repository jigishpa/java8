package com.senyume.java8;

/**
 * @author Jigish Patel
 */

public class Application {

	public static void main(String[] args){
		System.out.println("Collections demo application ...");

		Iteration iteration = new Iteration();
		System.out.println("-------------- old way -------------");
		iteration.iterateOldWay();
	}
}
