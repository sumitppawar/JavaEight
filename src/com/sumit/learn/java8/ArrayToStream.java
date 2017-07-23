package com.sumit.learn.java8;

import java.util.Arrays;
import java.util.stream.Stream;

import com.sumit.learn.model.Person;

public class ArrayToStream {

	public static void main(String[] args) {
		Person[] persons = new Person[] {
				new Person(24,"Bom"),
				new Person(27,"Mike")
		}; 
		
		//Stream<Person> stream = Stream.of(persons);
		
		//Second way
		Stream<Person> stream = Arrays.stream(persons);
		stream.forEach(p -> System.out.println(p));
	}

}
