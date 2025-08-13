package com.oracle.dao;

import java.util.List;

import com.oracle.beans.Employee;
import com.oracle.dao.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

public class EmployeeDaoJPAImpl implements EmployeeDAO {

	@Override
	public Employee save(Employee employee) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		manager.close();
		//manager.getEntityManagerFactory().close();
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		EntityManager manager = JPAUtil.getEntityManager();
		TypedQuery<Employee> query = manager.createQuery("select e from Employee e", Employee.class);
		List<Employee> employeeList = query.getResultList();
		manager.close();
		//manager.getEntityManagerFactory().close();
		return employeeList;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
