package com.oracle.dao.util;

import com.oracle.dao.EmployeeDAO;
import com.oracle.dao.EmployeeDaoTempImpl;

public class EmployeeDAOFactory {
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoTempImpl();
	}
}
