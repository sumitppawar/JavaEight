package com.sumit.learn.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class UseDateFormatter {

	public static void main(String[] args) {
		
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		
		//Default constant provided
		DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
		System.out.println(df.format(currDate));
		
		//Localize to french and style to Medium
		DateTimeFormatter fr_df = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.FRENCH);
		System.out.println(fr_df.format(currDate));
		
		//Custom Date format
		DateTimeFormatterBuilder dfb = new DateTimeFormatterBuilder()
				.appendValue(ChronoField.YEAR)
				.appendLiteral(",")
				.appendValue(ChronoField.MONTH_OF_YEAR)
				.appendLiteral(",")
				.appendValue(ChronoField.DAY_OF_MONTH);
		DateTimeFormatter custom_df = dfb.toFormatter();
		System.out.println(custom_df.format(currDate));
		
	}

}
