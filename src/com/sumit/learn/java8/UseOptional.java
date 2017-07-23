package com.sumit.learn.java8;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.sumit.learn.model.Person;

public class UseOptional {
	static List<Person> vault = new ArrayList<Person>();

	public static void main(String[] args) {
		vault.add(new Person(67, "Mike"));
		vault.add(new Person(37, "Bob"));
		vault.add(new Person(27, "Robin"));	
		
		Optional<Person> optPerson = getPersonByName("Mike");
		if(optPerson.isPresent()) {
			System.out.println(optPerson.get());
		}
	}
	
	public static Optional<Person> getPersonByName(String name) {
		return Optional.of(new Person(23, "Sumit"));
	}

}
