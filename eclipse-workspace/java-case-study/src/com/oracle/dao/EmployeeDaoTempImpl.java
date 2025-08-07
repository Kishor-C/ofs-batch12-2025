package com.oracle.dao;

import java.util.ArrayList;
import java.util.List;

import com.oracle.beans.Employee;

public class EmployeeDaoTempImpl implements EmployeeDAO {

	private static List<Employee> employeesDB = new ArrayList<Employee>();
	
	@Override
	public Employee save(Employee employee) {
		employeesDB.add(employee);
		return employee; // when you interact with the DB, you will return the saved entity
	}
	@Override
	public List<Employee> findAll() {
		// return a new list that will have all the employees
		List<Employee> employees = employeesDB.stream().toList();
		return employees;
	}
	@Override
	public void delete(Employee employee) {
		employeesDB.remove(employee);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
