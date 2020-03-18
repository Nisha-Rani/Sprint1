package com.capgemini.go.service;
import com.capgemini.go.util.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.go.dao.CancelDao;
import com.capgemini.go.dao.CancelDaoImpl;
import com.capgemini.go.dto.Order;
import com.capgemini.go.dto.Product;

public class CancelImpl implements Cancel{
	CancelDao dao;
	public CancelImpl() throws SQLException{
		dao=new CancelDaoImpl();
	}
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void cancelAnOrder(int ordId) throws Exception {
		System.out.println("Enter the order id to be cancelled");
		try{
			int oid=sc.nextInt();
			dao.cancelAnOrder(oid);
		}
		catch(Exception e)
		{
			System.out.println("order id cannot be string");
		}
		
	}

	@Override
	public void cancelAProduct(String proId) throws Exception {
		System.out.println("Enter the product id to be cancelled");
	    try{
		String pid=sc.nextLine();
		dao.cancelAProduct(pid);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	//System.out.println("product id cannot be number");
	    }
	}

}
