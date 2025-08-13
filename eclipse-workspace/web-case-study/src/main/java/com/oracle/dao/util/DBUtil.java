package com.oracle.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/orcl";
	private static final String USERNAME = "user01";
	private static final String PASSWORD = "Welcome123";
	
	// reusable method that returns the connection
	public static Connection getDBConnection() throws SQLException {
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return con;
	}
}
