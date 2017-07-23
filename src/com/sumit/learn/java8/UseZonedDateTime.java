package com.sumit.learn.java8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author sumit
 *  How to covert time between time zone ?
 */
public class UseZonedDateTime {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(df.format(zonedDateTime));
		
		ZonedDateTime dubaiZonedDateTime = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Dubai"));
		System.out.println(df.format(dubaiZonedDateTime));
		
		//Print all Zone Id 
		ZoneId.getAvailableZoneIds().forEach(id -> System.out.println(id));
	}
}
