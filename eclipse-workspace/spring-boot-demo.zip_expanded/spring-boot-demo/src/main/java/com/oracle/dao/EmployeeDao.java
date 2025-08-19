package com.oracle.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oracle.beans.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	// you can also create custom methods with @Query(JPQL) on top of it
}
/*
 * JpaRepository<T, ID>
 * T save(T t), void deleteById(ID), List<T> findAll()
 * EmployeDao extends JpaRepository<Employee, Integer>
 * Employee save(Employee e), void deleteById(Integer), List<Employee> findAll()
 * Spring Boot auto-implements EmployeeDao & all the methods will have SQL queries that
 * will be executed when you invoke them
 */
