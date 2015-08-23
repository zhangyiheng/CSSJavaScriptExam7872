package com.hand.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
	public static ResultSet getname(Connection conn,String name,String password) throws SQLException{
		String sql = "select * from customer where first_name=? and last_name=?";
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, password);
		ResultSet rs = preparedStatement.executeQuery();
		System.out.println("执行"+preparedStatement.execute());
		
		return rs;
	}
	public static ResultSet getAll(Connection conn) throws SQLException{
		String sql = "select first_name,last_name,email,customer.last_update,address,customer_id from customer,address where customer.address_id=address.address_id";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		ResultSet rs = preparedStatement.executeQuery();
		System.out.println("执行"+preparedStatement.execute());
		
		return rs;
	}
}
