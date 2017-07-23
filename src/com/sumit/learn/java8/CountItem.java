package com.sumit.learn.java8;

import java.util.ArrayList;
import java.util.List;

import com.sumit.learn.model.Person;

public class CountItem {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(37, "Bob"));
		list.add(new Person(67, "Mike"));
		list.add(new Person(27, "Robin"));	
		
		//Use of parallel stream cause performance issue , due split 
		long count = list
				.stream()
				.count();
		
		System.out.println("Count is " +  count);
	}

}
