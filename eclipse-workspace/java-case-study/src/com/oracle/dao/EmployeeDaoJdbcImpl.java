package com.oracle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.oracle.beans.Employee;
import com.oracle.dao.util.DBUtil;

public class EmployeeDaoJdbcImpl implements EmployeeDAO {

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		String SELECT_QUERY = "select * from employee";
		List<Employee> employees = new ArrayList<Employee>();
		//code related to getting employee records and converting to List goes here
		try {
			Connection con = DBUtil.getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(SELECT_QUERY);
			ResultSet result = pstmt.executeQuery();
			while(result.next()) {
				// gets employee data from the table and initializes employee object from that data 
				Employee emp = new Employee(result.getInt(1), result.getString(2), 
						result.getDate(3).toLocalDate());
				// adds each employee object initialized to the List<Employee>
				employees.add(emp);
			}
			// close all the resources
			result.close();
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return employees;
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
