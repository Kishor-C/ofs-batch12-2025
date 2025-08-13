package com.oracle.dao.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("web-case-study");
		EntityManager manager = factory.createEntityManager(); // gets the connection from the pool
		return manager;
	}
}
