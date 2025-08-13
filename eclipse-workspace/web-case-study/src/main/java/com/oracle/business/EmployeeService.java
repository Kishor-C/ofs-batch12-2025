package com.oracle.business;

import java.time.LocalDate;
import java.util.List;

import com.oracle.beans.Employee;

public interface EmployeeService {
	public Employee storeEmployee(Employee employee);
	public List<Employee> findEmployees();
	public Employee findEmployee(int id);
	public int storeEmployees(Employee... employee); // accepts 0 or more Employee objects
	public Employee updateEmployeeDobById(int id, LocalDate dob);
	public Employee updateEmployeeNameById(int id, String name);
	public void deleteEmployeeById(int id);
}
