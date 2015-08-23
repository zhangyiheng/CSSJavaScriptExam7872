package com.hand.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;





import com.hand.Connectionfactory.ConnectionFactory;
import com.hand.DAO.Customer;



public class CustomerCheck {
	private Customer cs = new Customer();

	public boolean check(String name,String password) {
		Connection conn = null;

		conn = ConnectionFactory.getfactory().getconn();

		try {
			
			if(name==null||password==null){
				return false;
			}else{
				ResultSet rs = cs.getname(conn, name, password);
				if (rs.next()) {
					return true;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;

	}
	public ResultSet getrs(String name) {
		Connection conn = null;

		conn = ConnectionFactory.getfactory().getconn();

		try {

			ResultSet rs = cs.getAll(conn);
			return rs;

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}
}
