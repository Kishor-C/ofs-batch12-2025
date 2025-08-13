package com.oracle;

import java.time.LocalDate;
import java.util.List;

import com.oracle.beans.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceUnit;
import jakarta.persistence.TypedQuery;

public class TestJPA {
	public static void main(String[] args) {
		// java-case-study
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("java-case-study");
		EntityManager manager = factory.createEntityManager(); // gets the connection from the pool
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee emp1 = new Employee(0, "Jennifer", LocalDate.parse("2005-04-02"));
		Employee emp2 = new Employee(0, "Vishnu", LocalDate.parse("2015-11-23"));
		manager.persist(emp1);
		manager.persist(emp2);
		transaction.commit();
		System.out.println("Generated Id = "+emp1.getId());
		System.out.println("Generated Id = "+emp2.getId());
		System.out.println("__________________________________");
		// to get all the entities you can use TypeQuery
		// JPQL - selects the entity and generates the query for the associated table
		TypedQuery<Employee> query = manager.createQuery("select e from Employee e", Employee.class);
		List<Employee> employeeList = query.getResultList();
		employeeList.forEach(x -> System.out.println(x));
		// close the resources
		manager.close();
		factory.close();
	}
}
