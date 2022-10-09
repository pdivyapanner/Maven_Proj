package com.testng.features;

import org.testng.annotations.Test;

public class Depends_On_Methods {
	
	
	@Test
	private void laptop() {
		System.out.println("Laptop");
	}
	@Test
	private void zebronics() {
		
		System.out.println("Zebronics");
		System.out.println(10/0);
	}
	@Test(priority = -2,dependsOnMethods = "zebronics",alwaysRun = true)
	private void offer() {
		
		System.out.println("Offer");
	}
	
	
	
	

}
