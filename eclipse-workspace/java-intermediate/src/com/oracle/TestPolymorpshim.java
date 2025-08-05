package com.oracle;

import java.time.LocalDate;

public class TestPolymorpshim {
	public static void main(String[] args) {
		Employee emp = new Employee(15, "Atharv", LocalDate.parse("2000-01-30"), 93893L, 50000.0);
		Student std = new Student(5, "Siddharth", LocalDate.parse("1999-12-30"), 87663L, "A");
		Person per = new Person("Raj", LocalDate.parse("1998-10-23"), 92933L);
		display(emp);
		display(std);
		display(per);
	}
	public static void display(Person p) { // Person p = std
		System.out.println(p); // toString() - dynamic polymorphism
	}
}
/*
 * 	HT = LT
 *  long = int
 *  long x = 35;
 *  int y = 45;
 *  long z = y; // HT = LT
 */
