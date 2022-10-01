package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

<<<<<<< HEAD
public static Connection provideConnection() {
		
=======
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
>>>>>>> main
		Connection conn=null;
		
		
		try {
<<<<<<< HEAD
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/web19_sb101db";
		
		try {
			conn= DriverManager.getConnection(url,"root","ravishek@0578");
=======
			conn=DriverManager.getConnection(url, "root", "ravishek@0578");
>>>>>>> main
>>>>>>> main
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
<<<<<<< HEAD
		
		
		
=======
<<<<<<< HEAD
		
		
		
		return conn;
		
	}
	
=======
>>>>>>> main
		return conn;
		
	}
<<<<<<< HEAD
	
=======

>>>>>>> main
>>>>>>> main
}
