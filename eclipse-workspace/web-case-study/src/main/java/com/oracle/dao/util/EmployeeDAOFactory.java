package com.oracle.dao.util;

import com.oracle.dao.EmployeeDAO;
import com.oracle.dao.EmployeeDaoJPAImpl;

public class EmployeeDAOFactory {
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJPAImpl();
	}
}
