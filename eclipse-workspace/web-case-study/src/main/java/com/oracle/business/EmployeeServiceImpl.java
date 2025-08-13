package com.oracle.business;

import java.time.LocalDate;
import java.util.List;

import com.oracle.beans.Employee;
import com.oracle.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDao;
	// when EmployeeServiceImpl is created you would pass EmployeeDAO
	// it will force you to pass the DAO while you create service object
	public EmployeeServiceImpl(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}
	@Override
	public Employee storeEmployee(Employee employee) {
		//some business logic like validating name, dob not to be null, then save
		Employee savedEmp = employeeDao.save(employee);
		return savedEmp;
	}
	@Override
	public List<Employee> findEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int storeEmployees(Employee... employee) {
		int counter = 0;
		for(Employee e : employee) {
			storeEmployee(e);
			counter++;
		}
		return counter;
	}

	@Override
	public Employee updateEmployeeDobById(int id, LocalDate dob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployeeNameById(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub

	}

}
