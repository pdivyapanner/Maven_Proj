package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order1 {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement ship1;
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement address1;
	@FindBy(xpath = "//input[@id='cgv']")
	private WebElement checkbox;
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement shipping;
	@FindBy(xpath = "//a[@class=\"logout\"]")
	private WebElement logout;
	public Order1(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver,this);
	
	
	}
	public WebElement getShip1() {
		return ship1;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getShipping() {
		return shipping;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
	
	
	

}
