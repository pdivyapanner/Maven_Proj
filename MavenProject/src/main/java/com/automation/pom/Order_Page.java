package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement ship;
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement address;
	@FindBy(xpath = "//a[@title='Previous']")
	private WebElement continueshoping;
	@FindBy(xpath = "//button[@type='submit'])[2]")
	private WebElement confirm;
	public Order_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getShip() {
		return ship;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getContinueshoping() {
		return continueshoping;
	}
	public WebElement getConfirm() {
		// TODO Auto-generated method stub
		return confirm;
	}

}
