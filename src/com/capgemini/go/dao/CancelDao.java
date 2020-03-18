package com.capgemini.go.dao;

import java.sql.SQLException;

import com.capgemini.go.dto.Order;
import com.capgemini.go.dto.Product;

public interface CancelDao {
		
		Product searchProduct(String proId) throws SQLException;
		boolean cancelAProduct(String proId) throws SQLException; 
		boolean cancelAnOrder(int ordId) throws SQLException ;
}
