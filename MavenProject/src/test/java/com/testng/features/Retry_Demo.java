package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Retry_Demo {

	@Test(retryAnalyzer  = Retry_Purpose.class)
	private void demo() {
		
		String username = "divya";
		String password = "kani";
	Assert.assertEquals(username,password);
		
		//System.out.println("equal");
		
		
	}
	
	
	
}
