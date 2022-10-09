package com.testng.features;

import org.testng.annotations.Test;

public class Description_Demo {

	@Test(description = "Launch Browser")
	private void browser_Launch() {
		
		System.out.println("Browser Launch");
	}
	@Test
	private void url() {
		
	System.out.println("url");
	}
	@Test(priority = 2,invocationCount = 3,invocationTimeOut = 1000,description = "refresh")
	private void refresh() {
System.out.println("Refresh");
	}
	
}
