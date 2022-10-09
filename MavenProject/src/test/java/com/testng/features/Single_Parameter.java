package com.testng.features;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Single_Parameter {
	
	@Parameters({"User","pass"})
	@Test
	public void login(@Optional("kani")String username,String password) {
		
		System.out.println(username);
		System.out.println(password);
		
	}
	
}