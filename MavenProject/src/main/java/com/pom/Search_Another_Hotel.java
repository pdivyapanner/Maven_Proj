package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Another_Hotel {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id='search_hotel']")
private WebElement serchanotherHotel;
	
	public Search_Another_Hotel(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver,this);
	}

	public WebElement getSerchanotherHotel() {
		return serchanotherHotel;
	}
	
	;
}
