package com.hand.Connectionfactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static String name;
	private static String password;
	private static String dburl;
	private static String driver;
	
	private static Connection conn;
	
	private static final ConnectionFactory factory = new ConnectionFactory();
	
	static {
		Properties properties = new Properties();
		
		InputStream is = ConnectionFactory.class.getClassLoader().getResourceAsStream("dbconnection.properties");
		try {
			
			
			properties.load(is);
			
			name = properties.getProperty("user");
			password = properties.getProperty("password");
			dburl = properties.getProperty("dbUrl");
			driver = properties.getProperty("MysqlDriver");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private ConnectionFactory(){
		
	}
	public static  ConnectionFactory getfactory(){
		return factory;
	}
	public  Connection getconn(){
		try {
			
			System.out.println(driver);
			System.out.println(dburl);
			System.out.println(name);
			System.out.println(password);
			
			Class.forName(driver);
			conn=DriverManager.getConnection(dburl, name, password);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
