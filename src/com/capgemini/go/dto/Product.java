package com.capgemini.go.dto;
import com.capgemini.go.util.*;

public class Product {
		String proId;
		String proCategory;
		String proName;
		float proPrice;
		int proQuantity;
		public Product(String proId, String proCategory, String proName,
				float proPrice, int proQuantity) throws Exception {
			super();
			if(proId.isEmpty())
				throw new Exception("proid cannot be empty");
			else
			this.proId = proId;
			
			if(proCategory.isEmpty())
				throw new Exception("product category cannot be empty");
			else
			this.proCategory = proCategory;
			
			if(proName.isEmpty())
				throw new Exception("product name cannot be empty");
			else
			this.proName = proName;
			
			if(proPrice<100)
				throw new Exception("product price cannot be less than 100");
			if(proPrice<0)
				throw new Exception("product price cannot be negative");
			else
			this.proPrice = proPrice;
			
			if(proQuantity<1)
				throw new Exception("product quantity cannot be less than 1");
			else
			this.proQuantity = proQuantity;
		}
		public Product() {
			// TODO Auto-generated constructor stub
		}
		public String getProId() {
			return proId;
		}
		public void setProId(String proId) {
			this.proId = proId;
		}
		public String getProCategory() {
			return proCategory;
		}
		public void setProCategory(String proCategory) {
			this.proCategory = proCategory;
		}
		public String getProName() {
			return proName;
		}
		public void setProName(String proName) {
			this.proName = proName;
		}
		public float getProPrice() {
			return proPrice;
		}
		public void setProPrice(float proPrice) {
			this.proPrice = proPrice;
		}
		public int getProQuantity() {
			return proQuantity;
		}
		public void setProQuantity(int proQuantity) {
			this.proQuantity = proQuantity;
		}
		@Override
		public String toString() {
			return "Product [proId=" + proId + ", proCategory=" + proCategory
					+ ", proName=" + proName + ", proPrice=" + proPrice
					+ ", proQuantity=" + proQuantity + "]";
		}
		
		
}
