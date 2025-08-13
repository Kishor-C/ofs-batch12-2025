package com.oracle.dao;

import java.util.List;

import com.oracle.beans.Employee;

public interface EmployeeDAO {
	// save an object and return the saved object
	Employee save(Employee employee);
	// return all the objects in the form of List
	List<Employee> findAll();
	// return an object based on the id
	Employee findById(int id);
	// delete an object 
	void delete(Employee employee);
	// update an object
	Employee update(Employee employee);
}
