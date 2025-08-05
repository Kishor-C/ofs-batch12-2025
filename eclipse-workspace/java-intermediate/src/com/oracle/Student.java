package com.oracle;

import java.time.LocalDate;

public class Student extends Person {
	private int rollNo;
	private String grades;
	public Student(int rollNo, String name, LocalDate dob,
			long phone, String grades) {
		super(name, dob, phone);
		this.rollNo = rollNo;
		this.grades = grades;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", grades=" + grades + ", getName()=" + getName() + ", getDob()="
				+ getDob() + ", getPhone()=" + getPhone() + "]";
	}
	

}
