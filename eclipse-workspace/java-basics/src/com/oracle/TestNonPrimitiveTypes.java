package com.oracle;

import java.time.LocalDate;
import java.time.LocalDateTime;


/*
 * Non primitive types will have one or more types of value
 */
public class TestNonPrimitiveTypes {
	public static void main(String[] args) {
		int[] items = {70, 80, 10, 20}; // an int array that stores 4 values
		String[] teams = {"India", "Australia", "England"};
		// you need to import LocalDate, LocalTime, LocalDateTime from java.time package
		// all the classes of java.lang package is auto-imported
		// LocalDate uses ISO format - yyyy-MM-dd and LocalTime uses - hh:mm:ss
		LocalDate startDate = LocalDate.parse("2025-10-05");
		LocalDate endDate = LocalDate.parse("2025-11-20");
		System.out.println("Items at 0th index: "+items[0]);
		System.out.println("Team at 1st index: "+teams[1]);
		System.out.println("Start Date: "+startDate);
		System.out.println("End Date: "+endDate);
		LocalDateTime event = LocalDateTime.parse("2025-10-04T16:00:00");
		System.out.println("Inaguration: "+event);
	}
}
