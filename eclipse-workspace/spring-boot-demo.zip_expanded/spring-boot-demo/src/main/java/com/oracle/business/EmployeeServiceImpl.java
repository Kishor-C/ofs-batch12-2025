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
	@Transactional
	public int storeEmployees(Employee... employee) {
		int count = 0;
		for(Employee e : employee) {
			employeeDao.save(e);
			count++;
		}
		return count;
	}

	@Override
	@Transactional
	public Employee updateEmployeeDobById(int id, LocalDate dob) {
		// this method is returning employee & throws exception if employee is not found
		Employee emp = findEmployee(id); 
		emp.setDob(dob);
		return emp;
	}

	@Override
	@Transactional
	public Employee updateEmployeeNameById(int id, String name) {
		Employee emp = findEmployee(id); 
		emp.setName(name);
		return emp;
	}

	@Override
	@Transactional
	public void deleteEmployeeById(int id) {
		// this will delete the employee if found else throws RuntimeException
		Employee emp = findEmployee(id); 
		employeeDao.delete(emp);
	}

}
