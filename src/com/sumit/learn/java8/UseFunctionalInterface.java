package com.sumit.learn.java8;

public class UseFunctionalInterface {

	public static void main(String[] args) {
		printSomething(() -> System.out.print("Awesome"));; 
	}

	static void printSomething(DoSomething something) {
		something.doSomething();
	}

}

//Optional annotation
@FunctionalInterface
interface DoSomething {
	void doSomething();
}