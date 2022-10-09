package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Reservation {
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement email;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	
	public Hotel_Reservation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
}
