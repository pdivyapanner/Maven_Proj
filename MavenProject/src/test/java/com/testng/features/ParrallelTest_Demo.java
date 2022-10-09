package com.testng.features;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utility.UtilityFiles;

public class ParrallelTest_Demo extends UtilityFiles {
	
	
	public static WebDriver driver;
	
	@Test
	private void facebook() {
		driver = UtilityFiles.get_browser("chrome");
		geturl("https://www.facebook.com/");
	}
	@Test
	private void whatsapp() {
		driver = UtilityFiles.get_browser("chrome");
		geturl("https://www.whatsapp.com/");
		
	}

}
