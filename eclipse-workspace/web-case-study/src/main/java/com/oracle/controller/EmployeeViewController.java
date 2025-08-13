package com.oracle.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.oracle.beans.Employee;
import com.oracle.business.EmployeeService;
import com.oracle.business.util.EmployeeServiceFactory;

public class EmployeeViewController {
	public static void main(String[] args) {
		// Controller needs Service instance
		EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();
		// Scanner to accept the input
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Enter choice:");
			System.out.println("1: Add Employee 2: Find All Employees -1: Exit");
			choice = scan.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("Enter name:");
				String name = scan.next();
				System.out.println("Enter DOB in yyyy-MM-dd format");
				LocalDate dob = LocalDate.parse(scan.next());
				// if it is stored in DB, id is auto-generated, 0 is ignored
				Employee emp = new Employee(0, name, dob);
				Employee emp2 = employeeService.storeEmployee(emp);
				System.out.println(emp2);
				System.out.println("**** Employee Stored *****");
				break;
			case 2 : 
				List<Employee> list = employeeService.findEmployees();
				list.forEach(x -> System.out.println(x));
				break;
			default : System.out.println("Wrong choice, program exits");
						choice = -1;
			}
		} while(choice != -1);
		scan.close();
	}
}
