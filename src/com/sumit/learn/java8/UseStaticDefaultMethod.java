package com.sumit.learn.java8;

public class UseStaticDefaultMethod {
	public static void main(String[] args) {
		Country.newInstance("India");
	}
}

interface Country {
	String getName();
	static Country newInstance(String name) {
		if("India".equalsIgnoreCase(name)) {
			return new India();
		}else {
			return null;
		}
	} 
}

class India implements Country {

	@Override
	public String getName() {
		return "India";
	}
	
}