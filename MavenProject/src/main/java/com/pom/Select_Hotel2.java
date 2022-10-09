package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel2 {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radio_Button1;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_Button1;
	
	public Select_Hotel2(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getRadio_Button1() {
		return radio_Button1;
	}
	public WebElement getContinue_Button1() {
		return continue_Button1;
	}
	
	

}
