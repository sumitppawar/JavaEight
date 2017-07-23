package com.sumit.learn.java8;

public class UseDefaultMethod {

	public static void main(String[] args) {
		Animal cat = new Cat();
		System.out.println(cat.getInfo());
	}
}

interface Animal {
	public String getName();
	default String getInfo() {
		return "Animal name type " + getName();
	}
}

class Cat implements Animal {
	@Override
	public String getName() {
		return "Cat";
	}
}