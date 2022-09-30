package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

<<<<<<< HEAD
public static Connection provideConnection() {
		
		Connection conn=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/web19_sb101db";
		
		try {
			conn= DriverManager.getConnection(url,"root","ravishek@0578");
=======

	public static Connection provideConnection() {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/web19sb101_db";
		try {
			conn=DriverManager.getConnection(url, "root", "ravishek@0578");
>>>>>>> main
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
<<<<<<< HEAD
		
		
		
		return conn;
		
	}
	
=======
		return conn;
	}

>>>>>>> main
}
