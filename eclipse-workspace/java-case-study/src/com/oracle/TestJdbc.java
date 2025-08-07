package com.oracle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import com.oracle.beans.Employee;

public class TestJdbc {
	public static void main(String[] args) {
		String URL = "jdbc:oracle:thin:@localhost:1521/orcl";
		//String URL = "jdbc:oracle:thin:@localhost:1521/orclpdb"
		String USERNAME = "user01";
		String PASSWORD = "Welcome123";
		// insert query to store sequence directly in the 1st column
		String INSERT_QUERY = "insert into employee values(emp_seq.nextval, ?, ?)";
		// select query to get all the records
		String SELECT_QUERY = "select * from employee";
		// query to generate the sequence
		String SEQ_QUERY = "select emp_seq.nextval from dual";
		// all the db operations must be wrapped in the try-catch in case of JDBC
		try {
			// all the JDBC API's are present in the java.sql package
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connected: "+con);
			PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);
			pstmt.setString(1, "Rahul");
			// import java.sql.Date - we convert LocalDate to Date using Date.valueOf(LocalDate)
			pstmt.setDate(2, Date.valueOf(LocalDate.parse("2004-04-18")));
			int count = pstmt.executeUpdate();
			System.out.println(count+" row inserted");
			pstmt.close();
			// for select query, you must set value to the ?, if its present in the select-query
			PreparedStatement select = con.prepareStatement(SELECT_QUERY);
			ResultSet result = select.executeQuery();
			// ResultSet has methods like next() to navigate, getType(index) to get the value
			while(result.next()) { // next method returns true if next row is present
				int empId = result.getInt(1); // returns the value from 1st column
				String empName = result.getString(2); // 2nd column has varchar2 hence String
				// you need to use java.sql.Date().toLocalDate() to get the LocalDate
				LocalDate empDob = result.getDate(3).toLocalDate();
				System.out.println(empId+" "+empName+" "+empDob);
				System.out.println("___ you can pass above values to the Employee object ____");
				Employee e = new Employee(empId, empName, empDob);
				System.out.println(e);
			}
			result.close();
			select.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
