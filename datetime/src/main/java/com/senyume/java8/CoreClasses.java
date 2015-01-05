package com.senyume.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jigish Patel
 */

public class CoreClasses {

	public void flightExample(){

		// we will format all dates in this formatter
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");

		// Each time zone is described by:
		//	1. zone id - an identifier (usual of format region/city - for e.g. Asia/Tokyo)
		//	2. zone offset - an offset from UTC/Greenwich time (for e.g. - +09:00)
		ZoneId departureZone = ZoneId.of("America/Los_Angeles");
		ZoneId arrivalZone = ZoneId.of("Asia/Tokyo");

		LocalDateTime departureLocalTime = LocalDateTime.now(departureZone);
		ZonedDateTime departureTime = ZonedDateTime.of(departureLocalTime, departureZone);

		System.out.printf("DEPARTING: %s departure time zone (%s)%n", departureTime.format(format), departureZone);
		System.out.printf("DEPARTING: %s destination time zone (%s)%n", departureTime.withZoneSameInstant(arrivalZone).format(format), arrivalZone);

		// Flight is 10 hours and 50 minutes, or 650 minutes
		System.out.printf("FLIGHT TIME: 10 hours 50 minutes %n");
		ZonedDateTime arrivalTime = departureTime.withZoneSameInstant(arrivalZone)
												 .plusMinutes(650);

		System.out.printf("ARRIVING: %s departure time zone (%s)%n", arrivalTime.withZoneSameInstant(departureZone).format(format), departureZone);
		System.out.printf("ARRIVING: %s departure time zone (%s)%n", arrivalTime.format(format), arrivalZone);

	}
}
