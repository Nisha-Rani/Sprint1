package com.capgemini.go.service;

public interface Cancel {
		void cancelAProduct(String proId) throws Exception;
		void cancelAnOrder(int ordId)throws Exception;
		
}
