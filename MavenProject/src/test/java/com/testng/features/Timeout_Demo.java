package com.testng.features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.utility.UtilityFiles;

public class Timeout_Demo extends UtilityFiles {
	public static WebDriver driver;
	@BeforeSuite
	private void setUp() {
		driver = get_browser("chrome");
	
	}
	@Test(timeOut = 10000)
	private void facebook() throws InterruptedException {
		
		geturl("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys("divya");
		Thread.sleep(2000);
		driver.findElement(By.id("passss")).sendKeys("vinay");
		
		
	}

}
