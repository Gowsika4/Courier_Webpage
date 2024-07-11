package com.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CourierDao {

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	public CourierDao() {
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/courierdb", "root", "root");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void storeData(Courier m) {
		String sql="insert into courier(username,address1,address2,phonenum,product,productno,quantity) values(?, ?, ?, ?, ?, ?, ?)";
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, m.getUsername());
			pst.setString(2, m.getAddress1());
			pst.setString(3, m.getAddress2());
			pst.setString(4, m.getPhonenum());
			pst.setString(5, m.getProduct());
			pst.setString(6, m.getProductno());
			pst.setString(7, m.getQuantity());
			pst.executeUpdate();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ResultSet retrieveMatch() {
		String sql="select * from courier";
		try{
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	}
