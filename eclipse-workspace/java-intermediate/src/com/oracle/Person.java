package com.oracle;
import java.time.LocalDate;
//Person - name, dob, phone
public class Person {
	private String name;
	private LocalDate dob;
	private long phone;
	// constructors
	public Person(String name, LocalDate dob, long phone) {
		super(); // ignore this statement now
		this.name = name;
		this.dob = dob;
		this.phone = phone;
	}
	// setters & getters for all the properties
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", phone=" + phone + "]";
	}
	
}
