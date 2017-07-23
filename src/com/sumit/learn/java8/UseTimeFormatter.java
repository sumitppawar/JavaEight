package com.sumit.learn.java8;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class UseTimeFormatter {

	public static void main(String[] args) {
		LocalTime  localTime = LocalTime.now();
		
		//Default provide constant
		DateTimeFormatter tf = DateTimeFormatter.ISO_TIME;
		System.out.println(tf.format(localTime));
		
		//Custom Formatter (1 Hour,2 Minutes , 3 Seconds)
		DateTimeFormatterBuilder tfb = new DateTimeFormatterBuilder()
				.appendValue(ChronoField.HOUR_OF_DAY)
				.appendLiteral(" Hours,")
				.appendValue(ChronoField.MINUTE_OF_HOUR)
				.appendLiteral(" Minutes,")
				.appendValue(ChronoField.SECOND_OF_MINUTE)
				.appendLiteral(" Seconds");
		System.out.println(tfb.toFormatter().format(localTime));
	}

}
