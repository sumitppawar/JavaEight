package com.sumit.learn.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class UseStringJoinerClass {

	public static void main(String[] args) {
		
		//String Joiner with delimiter, prefix, suffix and default value
		StringJoiner sj = new StringJoiner(",", "{", "}");
		sj.setEmptyValue("No value yet");
		System.out.println(sj); // print No value yet
		
		sj.add("David")
		.add("Narayan")
		.add("Hanuman");
		
		System.out.println(sj);//{David,Narayan,Hanuman}
		
		//Merging StringJoiner
		StringJoiner sj2 = new StringJoiner(",");
		sj2.add("SUmit");
		sj.merge(sj2);
		System.out.println(sj);//{David,Narayan,Hanuman,SUmit}
		
		List<String> list = new ArrayList<>();
		list.add("David");
		list.add("Narayn");
		list.add("Vithan");
		list.add("Namaya");
		
		//String joiner using collection
		StringJoiner sj3 = new StringJoiner(" and ", "{", "}");
		list.forEach(name -> sj3.add(name));
		System.out.println(sj3);//{David and Narayn and Vithan and Namaya}
	}

}
