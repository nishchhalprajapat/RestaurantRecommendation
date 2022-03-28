package com.sebone.restaurant.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sebone.restaurant.DO.RestaurantDO;
public class DbConfig {
	static Connection con;
	public static Connection create() {
		try {
			String DB_URL="jdbc:mysql://localhost/local_restaurants";
			String User="root";
			String Pwd="Nish@123";
			con=DriverManager.getConnection(DB_URL,User,Pwd);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
