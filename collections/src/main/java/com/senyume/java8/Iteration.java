package com.senyume.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Jigish Patel
 */

public class Iteration {

	final List< String > friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

	public void iterateOldWay1(){
		for(int i=0; i<friends.size(); i++){
			System.out.println(friends.get(i));
		}
	}

	// for(...) uses an iterator behind the scene (external iterator)
	public void iterateOldWay2(){
		for(String friend: friends){
			System.out.println(friend);
		}
	}

	// internal iterator (Iterable interface) has a new method forEach(), which accepts parameter of type Consumer
	// Consumer will consume via it's accept() method
	// forEach() + anonymous inner class
	public void iterateNewWay1(){
		friends.forEach(new Consumer<String> () {
			public void accept(final String friend){
				System.out.println(friend);
			}
		});
	}

	// forEach + lambda expression (anonymous function)
	// variable 'friend' is bound to each element of the collection during the call
	// standard syntax for lambda expression - parameters in parenthesis, type information for each parameter, comma separated
	// when we pass a lambda expression, the compiler will convert it to an instance of appropriate functional interface
	// the synthesized method of this instance conforms to the abstract method of the functional interface. this abstract
	// method takes the same arguments as the lambda expression
	public void iterateNewWay2(){
		friends.forEach( (final String friend) ->
			System.out.println(friend));
	}

	// forEach + lambda expression
	// compiler can infer the type of the parameter 'friend'
	// (by looking up signature of called method - forEach - and and analyzing functional interface it takes as a parameter)
	// type inference will work for multiple parameters - but we need to leave out type information for all parameters in that case
	public void iterateNewWay3(){
		friends.forEach((friend) -> System.out.println(friend));
	}

	// the compiler treats single-parameter lambda expressions as special
	// we can leave out the parenthesis around the parameter if the type is inferred
	public void iterateNewWay4(){
		friends.forEach( friend -> System.out.println(friend));
	}

	// passing a method reference instead of the method (lambda expression)
	public void iterateNewWay5(){
		friends.forEach(System.out::println);
	}
}
