package com.sumit.learn.model;

public class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public static int compaireByAge(Person p1, Person p2) {
		return new Integer(p1.getAge()).compareTo(p2.age);
	}
	
	@Override
	public String toString() {
		return this.name + "(" + this.age + ")";
	}
}
