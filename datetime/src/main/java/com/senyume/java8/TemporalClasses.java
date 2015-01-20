package com.senyume.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * @author Jigish Patel
 */

public class TemporalClasses {

	public void holidaysExample(){
		LocalDate today = LocalDate.now();
		LocalDate lastYear = today.minusYears(1);
		LocalDate nextYear = today.plusYears(1);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy");

		// This year
		// Labor Day is first Monday in September
		LocalDate laborDay = today.withMonth(Month.SEPTEMBER.getValue())
				.with(java.time.temporal.TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		LocalDate laborDayLastYear = lastYear.withMonth(Month.SEPTEMBER.getValue())
				.with(java.time.temporal.TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		LocalDate laborDayNextYear = nextYear.withMonth(Month.SEPTEMBER.getValue())
				.with(java.time.temporal.TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.printf("Labor Day this year %s: %s%n", laborDay.isBefore(today)? "was" : "is", laborDay.format(format));
		System.out.printf("Labor Day last year was: %s%n", laborDayLastYear.format(format));
		System.out.printf("Labor Day next year will be: %s%n", laborDayNextYear.format(format));

		// Thanksgiving is fourth Thursday in November
		LocalDate thanksgiving = today.withMonth(Month.NOVEMBER.getValue())
				.with(java.time.temporal.TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.THURSDAY));
		LocalDate thanksgivingLastYear = lastYear.withMonth(Month.NOVEMBER.getValue())
				.with(java.time.temporal.TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.THURSDAY));
		LocalDate thanksgivingNextYear = nextYear.withMonth(Month.NOVEMBER.getValue())
				.with(java.time.temporal.TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.THURSDAY));
		System.out.printf("Thanksgiving this year %s: %s%n", thanksgiving.isBefore(today)? "was" : "is", thanksgiving.format(format));
		System.out.printf("Thanksgiving last year was: %s%n", thanksgivingLastYear.format(format));
		System.out.printf("Thanksgiving next year will be: %s%n", thanksgivingNextYear.format(format));
	}

}
