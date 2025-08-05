package com.oracle;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner must be closed after taking the inputs
		System.out.println("Enter your name");
		String name = scan.next();
		System.out.println("Enter your phone no.");
		long phone = scan.nextLong();
		System.out.println("Enter your address");
		scan.nextLine();
		String address = scan.nextLine();
		System.out.println("Name = "+name+", Phone = "+phone+", Address = "+address);
		scan.close(); // close if you are done with taking inputs
	}
}
