package com.sumit.learn.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import com.sumit.learn.model.Person;

public class SumAndAgreegate {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(37, "Bob"));
		list.add(new Person(67, "Mike"));
		list.add(new Person(27, "Robin"));	
		
		int sum = list
				.stream()
				.mapToInt(p -> p.getAge())
				.sum();
		System.out.println("Sum of age is " + sum);
		
		OptionalDouble agg = list
				.stream()
				.mapToInt(p -> p.getAge())
				.average();
		if(agg.isPresent()) {
			//System.out.println(" Aggreegate is " + agg);
			System.out.println(" Aggreegate is " + agg.getAsDouble());
		} else {
			System.out.println("Value is not defined");
		}
	}
	
}
