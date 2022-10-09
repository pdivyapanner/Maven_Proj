package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dress {
	public WebDriver driver;
	
	@FindBy(xpath = "//li[@id='category-thumbnail']//following::a")
	private WebElement dresses;
	@FindBy(xpath = "//li[@id='category-thumbnail']//following::a[.='Casual Dresses']")
	private WebElement casualdress;
	@FindBy(xpath = "//div[@id='center_column']/ul/li/div/div/div/a/img")
	private WebElement image;
	@FindBy(xpath = "//div[@id='center_column']/ul/li/div/div/div/a[2][@class='quick-view']/span")
	private WebElement quickview;
	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addtocart;
	@FindBy(xpath = "//div[@id='layer_cart']/div/div[2]/div[4]/a")
	private WebElement proceedToCheck;
	public Casual_Dress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getCasualdress() {
		return casualdress;
	}
	public WebElement getImage() {
		return image;
	}
	public WebElement getQuickview() {
		return quickview;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getProceedToCheck() {
		return proceedToCheck;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
