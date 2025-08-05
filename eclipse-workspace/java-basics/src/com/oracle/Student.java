package com.oracle;
/*
 * A Student class can have properties like rollNo, name, grades 
 */
public class Student {
	private int rollNo;
	private String name;
	private String grades;
	// constructor - if no constructors are provided, then default constructor is created
	// you can use parameter variables & properties name same, but use this to differentiate
	public Student(int rollNo, String name, String grades) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grades = grades;
	}
	// avoid printing inside the methods, instead return what you want to print
	public String display() {
		//System.out.println("Student RollNo = "+rollNo+", Name = "+name+", Grades = "+grades);
		return "Student RollNo = "+rollNo+", Name = "+name+", Grades = "+grades;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public int getRollNo() {
		return rollNo;
	}
	
}
