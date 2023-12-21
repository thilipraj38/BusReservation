package com.model;

import java.sql.*;

public class DBConnection {
	private static final String url = "jdbc:postgresql://localhost:5432/busreservation";
	private static final String userName = "postgres";
	private static final String pass = "root";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,pass);
	}
}
