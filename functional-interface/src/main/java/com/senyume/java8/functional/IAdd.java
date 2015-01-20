package com.senyume.java8.functional;

/**
 * @author Jigish Patel
 */


@FunctionalInterface
public interface IAdd<T> {

	// Every method declaration in the body of an interface is implicitly public and abstract
	T add (T param1, T param2);
}
