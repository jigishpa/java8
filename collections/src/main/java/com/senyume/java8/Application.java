package com.senyume.java8;

/**
 * @author Jigish Patel
 */

public class Application {

	public static void main(String[] args){
		System.out.println("Collections demo application ...");
		runIterationCode();

	}

	public static void runIterationCode(){
		Iteration iteration = new Iteration();
		System.out.println("-------------- old way #1 -------------");
		iteration.iterateOldWay1();
		System.out.println("-------------- old way #2 -------------");
		iteration.iterateOldWay2();

		System.out.println("-------------- new way #1 -------------");
		iteration.iterateNewWay1();
		System.out.println("-------------- new way #2 -------------");
		iteration.iterateNewWay2();
		System.out.println("-------------- new way #3 -------------");
		iteration.iterateNewWay3();
		System.out.println("-------------- new way #4 -------------");
		iteration.iterateNewWay4();
		System.out.println("-------------- new way #5 -------------");
		iteration.iterateNewWay5();
	}
}
