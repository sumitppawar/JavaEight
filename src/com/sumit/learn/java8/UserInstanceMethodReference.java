package com.sumit.learn.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sumit.learn.model.Person;

public class UserInstanceMethodReference {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(37, "Bob"));
		list.add(new Person(67, "Mike"));
		list.add(new Person(27, "Robin"));
		
		UserInstanceMethodReference object = new UserInstanceMethodReference();
		
		//Method Reference instance
		Collections.sort(list, object :: compaireByAge);
		
		list.forEach(p -> System.out.println(p));
	}

	public  int compaireByAge(Person p1, Person p2) {
		return new Integer(p1.getAge()).compareTo(p2.getAge());
	}
}
