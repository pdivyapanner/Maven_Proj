package com.testng.features;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utility.UtilityFiles;

public class Invocation_Demo extends UtilityFiles{
	 public static WebDriver driver;
	@Test
	private void browser_Launch() {
		driver = get_browser("chrome");
		
		//System.out.println("Browser Launch");
	}
	@Test
	private void url() {
		geturl("https://www.facebook.com/");
		
	//	System.out.println("url");
	}
	@Test(priority = 2,invocationCount = 3,invocationTimeOut = 1000)
	private void refresh() {
		driver.navigate().refresh();
	}
	

}
