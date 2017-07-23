package com.sumit.learn.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {

	public static void main(String[] args) {
		
		//Local Date
		LocalDate localeDate = LocalDate.now();
		System.out.println(localeDate);
		
		//Local Specific Date
		LocalDate specificLocaleDate = LocalDate.of(2017, 07, 23);
		System.out.println(specificLocaleDate);
		
		//Local Time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		//Local specific time
		LocalTime specificLocalTime = LocalTime.of(17, 50, 50);
		System.out.println(specificLocalTime);
		
		//LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		//Specific Local Date time
		LocalDateTime specificLocalDateTime = LocalDateTime.of(specificLocaleDate, specificLocalTime);
		System.out.println(specificLocalDateTime);
	}

}
