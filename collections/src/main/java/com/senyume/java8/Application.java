package com.senyume.java8;

/**
 * @author Jigish Patel
 */

public class Application {

	public static void main(String[] args){
		System.out.println("Collections demo application ...");
		//runIterationCode();
		//runTransformationCode();
		runFindingElements();
	}

	public static void runIterationCode(){
		Iteration iteration = new Iteration();
		System.out.println("-------------- iteration old way #1 -------------");
		iteration.iterateOldWay1();
		System.out.println("-------------- iteration old way #2 -------------");
		iteration.iterateOldWay2();

		System.out.println("-------------- iteration new way #1 -------------");
		iteration.iterateNewWay1();
		System.out.println("-------------- iteration new way #2 -------------");
		iteration.iterateNewWay2();
		System.out.println("-------------- iteration new way #3 -------------");
		iteration.iterateNewWay3();
		System.out.println("-------------- iteration new way #4 -------------");
		iteration.iterateNewWay4();
		System.out.println("-------------- iteration new way #5 -------------");
		iteration.iterateNewWay5();
	}

	public static void runTransformationCode(){
		Transformation transformation = new Transformation();
		System.out.println("-------------- transform old way #1 -------------");
		transformation.transformOldWay1();
		System.out.println("-------------- transform new way #1 -------------");
		transformation.transformNewWay1();
		System.out.println("-------------- transform new way #2 -------------");
		transformation.transformNewWay2();
		System.out.println("-------------- transform new way - count characters -------------");
		transformation.countCharactersInName();
		System.out.println("-------------- transform new way #3 -------------");
		transformation.transformNewWay3();
	}

	public static void runFindingElements(){
		FindingElements findingElements = new FindingElements();
		System.out.println("-------------- printing all friends -------------");
		findingElements.printAllFriends();
		System.out.println("-------------- finding friends starting with N - old way #1 -------------");
		findingElements.startsWithNOldWay1();
	}
}
