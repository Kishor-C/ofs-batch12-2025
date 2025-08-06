package com.oracle;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private LocalDate dob;
	private double salary;
	// generate 2 constructors, setters & getters, toString for all the properties
	public Employee(int id, String name, LocalDate dob, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + "]";
	}
	 // ensures the signature matches with the super class
	@Override
	public int hashCode() {
		return id;
	}
	@Override // ensures the signature of equals match
	public boolean equals(Object other) {
		Employee emp = (Employee) other; // LT = (LT) HT;
		return (this.id == emp.id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		// compare(x, y) :  return (x < y) ? -1 : ((x == y) ? 0 : 1);
		return Integer.compare(this.id, o.id);
	}
	
}
