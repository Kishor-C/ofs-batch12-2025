package com.oracle;

import java.time.LocalDate;

public class Employee extends Person {
	private int id;
	private double salary;
	public Employee(int id, String name, 
			LocalDate dob, long phone, double salary) {
		super(name, dob, phone);
		this.id = id;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", getName()=" + getName() + ", getDob()=" + getDob()
				+ ", getPhone()=" + getPhone() + "]";
	}
	
	
}
