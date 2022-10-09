package com.pom.automation;

import org.openqa.selenium.WebDriver;

import com.automation.pom.Casual_Dress;
import com.automation.pom.Evening_Dress;
import com.automation.pom.My_Store;
import com.automation.pom.Order1;
import com.automation.pom.Order_Page;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private My_Store store;
	private Casual_Dress dress;
	private Order_Page order;
	private Evening_Dress evening;
	private Order1 payment;
	
	
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
		
	}
	public My_Store getStore() {
		if(store==null) {
		store = new My_Store(driver);
		}
		return store;
	}
	public Casual_Dress getDress() {
		if(dress==null) {
		dress = new Casual_Dress(driver);
		}
		return dress;
	}
	public Order_Page getOrder() {
		if(order==null) {
		order = new Order_Page(driver);
		}
		return order;
	}
	public Evening_Dress getEvening() {
		if(evening==null) {
				evening = new Evening_Dress(driver);
		}
		return evening;
	}
	public Order1 getPayment() {
		
		if(payment ==null) {
		payment = new Order1(driver);
	}
		return payment;
	}
	
	
	
	
	
	
	
	
}
