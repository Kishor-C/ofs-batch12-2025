package com.oracle;


public class TestStudentObjects {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Atharv", "A");
		// student1[rollNo=0, name=null, grades=null]
		Student student2 = new Student(2, "Siddharth", "A+");
		System.out.println(student1.display());
		System.out.println(student2.display());
		//student1.rollNo = 0;
		student1.setGrades("A+");
		System.out.println(student1.display());
		System.out.println(student2.display());
	}
}
