package com.oracle;

import java.time.LocalDate;

public class TestInheritance {
	public static void main(String[] args) {
		// Employee(int, String, LocalDate, long, double)
		Employee emp = new Employee(15, "Atharv", LocalDate.parse("2000-01-30"), 93893L, 50000.0);
		Student std = new Student(5, "Siddharth", LocalDate.parse("1999-12-30"), 87663L, "A");
		// you can invoke setters & getters of Person
		// from both the references like emp & std
		System.out.println("***** Employee Details ****** ");
		System.out.println("Hello "+emp.getName()+", your id: "+emp.getId()+", Dob: "+emp.getDob());
		System.out.println("***** Student Details ****** ");
		System.out.println("Hi "+std.getName()+", your grade is: "+std.getGrades()+
				", Dob: "+std.getDob());
	}
}
