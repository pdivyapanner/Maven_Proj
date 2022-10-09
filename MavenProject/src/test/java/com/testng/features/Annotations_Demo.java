package com.testng.features;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {
	@BeforeSuite
	private void set_Property() {
System.out.println("Set Property");
		
	}
	@BeforeTest
	private void browser_Launch() {
		System.out.println("Browser_Launched");
		
	}
	@BeforeClass
	private void launch_Url()
	{
		System.out.println("Url Launched");
	}
	@Test
	private void casual_Dresses() {
		System.out.println("Casual Dresses");
		
	}
	@BeforeMethod
	private void login() {

		System.out.println("login");
	}
	@Test
	private void t_shirts() {
		System.out.println("t_shirts");
	}
	@Test
	private void summer_Dress() {
		
System.out.println("Summer Dresses");
	}
	
	
	

}
