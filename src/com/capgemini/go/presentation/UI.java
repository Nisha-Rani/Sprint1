package com.capgemini.go.presentation;
import com.capgemini.go.dao.CancelDao;
import com.capgemini.go.dao.CancelDaoImpl;
import com.capgemini.go.dto.Order;
import com.capgemini.go.dto.Product;
import com.capgemini.go.service.*;
import com.capgemini.go.util.*;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UI {

		public static void main(String []args) throws Exception{
					
			Cancel service=new CancelImpl();
			Product p1=new Product();
			Order o1=new Order();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("1.CANCELLING A PRODUCT");
			System.out.println("2.CANCELLING AN ORDER");
			System.out.println("Enter the choice:");
			int q=sc.nextInt();
			switch(q){
			case 1:
			System.out.println("-------Do you want to cancel the product------");
			System.out.println("                1. Yes             ");
			System.out.println("                2. No              ");
			int n=sc.nextInt();
			switch(n){
			case 1:	String pid=sc.nextLine();	   
					service.cancelAProduct(pid);
					System.out.println(" Record Deleted....");
					break;
					//throw new Exception("product id cannot be empty");
			case 2: System.out.println("Ok Thankyou");
					break;
			default:System.out.println("you have entered the wrong choice");
			}
			
			break;
			
			case 2:
			System.out.println("----------Do you want to cancel your order--------");
			System.out.println("                    1. Yes                  ");
			System.out.println("                    2. No                   ");
			System.out.println("press 1 for Yes and 2 for No");
			int a=sc.nextInt();
			switch(a){
			case 1:	int oid=sc.nextInt();
					service.cancelAnOrder(oid);
					System.out.println(" Order Deleted....");
					break;
			case 2: System.out.println("ok, your order will not cancel");
					break;
			default:System.out.println("you have entered the wrong choice");
			}
		
			break;
			
			default:System.out.println("you have entered the wrong choice!!");
			}
		}	
}
