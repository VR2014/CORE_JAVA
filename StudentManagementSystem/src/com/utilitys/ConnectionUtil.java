package com.utilitys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Student_management";
	private static final String Uname = "root";
	private static final String pass = "7036791631";

	public static Connection getDataConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL, Uname, pass);

	}

}
