package com.capgemini.go.dto;

public class Order {
	String ordId;
	String ordName;//username
	
	public Order(String ordId, String ordName) throws Exception {
		super();
		
		if(ordId.isEmpty())
			throw new Exception("order id cannot be empty");
		else
		this.ordId = ordId;
		
		if(ordName.isEmpty())
			throw new Exception("order name cannot be empty");
		else
		this.ordName = ordName;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public String getOrdId() {
		return ordId;
	}
	public void setOrdId(String ordId) {
		this.ordId = ordId;
	}
	public String getOrdName() {
		return ordName;
	}
	public void setOrdName(String ordName) {
		this.ordName = ordName;
	}
	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordName=" + ordName + "]";
	}
	
}
