package com.oracle;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployeeCollection {
	public static void main(String[] args) {
		// create some employee objects to add in a Set<Employee>
		Employee emp1 = new Employee(5, "Raj", LocalDate.parse("2001-10-25"), 5000);
		Employee emp2 = new Employee(6, "Vijay", LocalDate.parse("2002-10-25"), 87000);
		Employee emp3 = new Employee(1, "Sachin", LocalDate.parse("2002-11-24"), 66000);
		Employee emp4 = new Employee(2, "Siddharth", LocalDate.parse("2019-12-26"), 25000);
		Employee emp5 = new Employee(4, "Atharv", LocalDate.parse("2024-04-08"), 15000);
		
		// add the above employees to the set
		
		Comparator<Employee> descSalary = (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary());
		// LocalDate implements Comparable.compareTo
		Comparator<Employee> ascDob = (e1, e2) -> e1.getDob().compareTo(e2.getDob());
		// String implements Comparable.compareTo
		Comparator<Employee> ascName = (e1, e2) -> e1.getName().compareTo(e2.getName());
		//Note: for int, double, long & etc you must use Wrapper class compare method
		// pass different comparator reference to the TreeSet(Comparator<T>)
		Set<Employee> employeeSet = new TreeSet<Employee>(descSalary);
		// checkout by passing ascDob & ascName
		// implement Comparator for all the properties in ascending & descending & test it here
		employeeSet.add(emp1);	employeeSet.add(emp2);	employeeSet.add(emp3);
		employeeSet.add(emp4);	employeeSet.add(emp5);
		
		// iterate using for loop
		for(Employee emp : employeeSet) {
			System.out.println(emp);
		}
	}
}
