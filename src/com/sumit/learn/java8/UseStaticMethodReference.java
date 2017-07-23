package com.sumit.learn.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sumit.learn.model.Person;

public class UseStaticMethodReference {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(37, "Bob"));
		list.add(new Person(67, "Mike"));
		list.add(new Person(27, "Robin"));
		
		
		//Method Reference
		Collections.sort(list, Person :: compaireByAge);
		
		list.forEach(p -> System.out.println(p));
	} 

}
