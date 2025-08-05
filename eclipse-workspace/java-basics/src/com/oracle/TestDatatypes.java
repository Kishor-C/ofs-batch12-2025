package com.oracle;

/*
 * Java class names must always use camel case, starts with uppercase
 * Java variables, methods use camel case, starts with lowercase
 * main method - public static void main(String[] args) { } 
 * Note String 'S' is capital letter because it is a built in class
 * control + space is used to complete the statement in eclipse
 * System.out.println() is the statement you can use to print
 */
public class TestDatatypes {
	public static void main(String[] args) {
		System.out.println("**** Understanding Datatypes *****");
		int customerId = 98765; // int takes 4 bytes - 32 bits
		String name = "Sachin"; // String is not a primitive type, its a derived type
		double balance = 567.5; // double takes 8 bytes
		boolean isEmployed = true; // boolean size is unspecified, it takes true/false value
		char gender = 'M'; // char takes only one character, it occupies 2 bytes
		String pan = "BAUIJ7833M"; 
		long aadhar = 798239849384L;
		//byte, short, int and long - integers 
		//float & double - fractional numbers - 4.5F or 4.5
		System.out.println("Customer Id = "+customerId);
		System.out.println("Name = "+name+", Gender = "+gender);
		System.out.println("Balance = "+balance+", Employed = "+isEmployed);
		System.out.println("PAN = "+pan+", Aadhar = "+aadhar);
	}
}
