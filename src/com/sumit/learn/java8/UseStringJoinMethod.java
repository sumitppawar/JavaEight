package com.sumit.learn.java8;

import java.util.ArrayList;
import java.util.List;

public class UseStringJoinMethod {

	public static void main(String[] args) {
		
		//Add comma between list
		String str = String.join(",","David", "Narayn", "Vithan", "Namaya");
		System.out.println(str);
		
		//Second version
		List<String> list = new ArrayList<>();
		list.add("David");
		list.add("Narayn");
		list.add("Vithan");
		list.add("Namaya");
		
		//Takes collection
		str = String.join(",", list);
	}

}
