package com.oracle.business;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.beans.Employee;
import com.oracle.dao.EmployeeDao;
/*
 * First apply @Service on top of the class
 * Secondly use @Autowired on top of the EmployeeDao
 * Thirdly call appropriate CRUD methods from EmployeeDAO inside the service 
 * layer method, you must use @Transactional on top of the methods that do DML
 * operations - so that it automatically rollsback if any operation inbetween 
 * fails
 * 
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional // import from org.springframework package
	@Override
	public Employee storeEmployee(Employee employee) {
		// the save method takes employee name & dob, 
		// but returns employee with generated id
		Employee created = employeeDao.save(employee);
		return created;
	}
	@Override
	public List<Employee> findEmployees() {
		List<Employee> list = employeeDao.findAll();
		return list;
	}
	@Override
	public Employee findEmployee(int id) {
		// findById returns Optional from that you can throw exception if id is not found
		Optional<Employee> op = employeeDao.findById(id);
		return op.orElseThrow(() -> new RuntimeException("Employee with an id "+id+" not found"));
	}

	@Override
	public int storeEmployees(Employee... employee) {
		// TODO Auto-generated method stub
		return 0;
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
