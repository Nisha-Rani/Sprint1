package com.capgemini.go.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.capgemini.go.dto.Order;
import com.capgemini.go.dto.Product;
import com.capgemini.go.util.jdbc;

public class CancelDaoImpl implements CancelDao {

	Connection connection;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	public CancelDaoImpl() throws SQLException
	{
		connection=jdbc.myConnection();
	}
	
	@Override
	public boolean cancelAProduct(String proId) throws SQLException  {
		Product p1 = new Product();
		p1=searchProduct(proId);
	    
		if(p1!=null){
			pst=connection.prepareStatement("delete from Product where proId=?");
			pst.setString(1, proId);
			int rs=pst.executeUpdate();
			if(rs==1){
				return true;
			}
		}
		return false;	
	}

	@Override
	public boolean cancelAnOrder(int ordId) throws SQLException  {
		Order o1 = new Order();
		
		if(o1!=null){
			pst=null;
			pst=connection.prepareStatement("delete from product where ordId=?");
			pst.setInt(1,ordId);
			int rs=pst.executeUpdate();
			if(rs==1){
				return true;
			}
		}
			return false;
	}
	public Product searchProduct(String pid) throws SQLException {
		Product p1=new Product();
	
         pst = connection.prepareStatement("Select * from product where proId=?");
         pst.setString(1, pid);
         
		
		rs=null;
		rs=pst.executeQuery();
	
		if(rs.next())
		{
//			/p1 = null;
			p1 = new Product();
			p1.setProId(pid);
			p1.setProCategory(rs.getString(3));
			p1.setProName(rs.getString(4));
			p1.setProPrice(rs.getFloat(5));
			p1.setProQuantity(rs.getInt(6));
			System.out.print(p1.getProId());
			}
			return p1;
}
}
	
