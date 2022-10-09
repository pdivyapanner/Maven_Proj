package com.testng.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Purpose implements IRetryAnalyzer {

	int starting_value = 1;
	int ending_val = 3;
	
	public boolean retry(ITestResult result) {
		
		if(starting_value<=ending_val)
		{
			starting_value++;
			return true;
			
		}
		return false;
	}

}
