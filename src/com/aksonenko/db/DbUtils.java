package com.aksonenko.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	
	private DbUtils() {	
		
	}
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/source_it?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
