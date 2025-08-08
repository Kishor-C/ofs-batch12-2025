package com.oracle.beans;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

// id, name, dob - generate 2 constructors, setters, getters, toString
@Entity // this used to map java objects to the table
@Table(name = "employee") // maps to the employee table
public class Employee {
	@Id // built-in annotation to mark the primary key
	@Column(name = "id") // optional if property & column names are same
	// below annotations are used to mention the sequence name
	@SequenceGenerator(name="EMP_SEQ_GEN", sequenceName="EMP_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_SEQ_GEN")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "dob")
	private LocalDate dob;
	//2 constructors
	public Employee(int id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
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
}
