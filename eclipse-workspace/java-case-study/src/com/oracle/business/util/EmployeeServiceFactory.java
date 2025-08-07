package com.oracle.business.util;

import com.oracle.business.EmployeeService;
import com.oracle.business.EmployeeServiceImpl;
import com.oracle.dao.EmployeeDAO;
import com.oracle.dao.util.EmployeeDAOFactory;

public class EmployeeServiceFactory {
	public static EmployeeService getService() {
		EmployeeDAO employeeDAO = EmployeeDAOFactory.getEmployeeDAO();
		EmployeeService employeeService = new EmployeeServiceImpl(employeeDAO);
		return employeeService;
	}
}
/*
 * In the service we have a constructor that accept EmployeeDAO
 */
