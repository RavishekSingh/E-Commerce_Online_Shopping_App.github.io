package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {


	public static Connection provideConnection() {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/web19sb101_db";
		try {
			conn=DriverManager.getConnection(url, "root", "ravishek@0578");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
