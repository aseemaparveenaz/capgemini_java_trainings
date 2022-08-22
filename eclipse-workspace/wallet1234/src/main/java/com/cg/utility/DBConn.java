package com.cg.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	private static Connection con;
	static {
	try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcsprint","root","");
	} catch (SQLException |ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	public static Connection getConnection(){
	return con;
	}

}
