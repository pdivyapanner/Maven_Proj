package com.testng.features;

import org.testng.annotations.Test;

public class ExpectedException_Demo {
	
//	@Test(expectedExceptions = ArithmeticException.class)
//	private void exception() {
//		
//		System.out.println(10/0);
//		
//	}
//	
	@Test(expectedExceptions = NullPointerException.class)
	private void unExpected() {
		System.out.println(10/0);	
	}
	
	

}
