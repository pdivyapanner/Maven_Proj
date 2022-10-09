package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first_name;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement last_Name;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement credit_card;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement card_type;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expiry_Month;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expiry_year;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv_Number;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_Now;
	public Book_A_Hotel(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver,this);
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_Name() {
		return last_Name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit_card() {
		return credit_card;
	}
	public WebElement getCard_type() {
		return card_type;
	}
	public WebElement getExpiry_Month() {
		return expiry_Month;
	}
	public WebElement getExpiry_year() {
		return expiry_year;
	}
	public WebElement getCvv_Number() {
		return cvv_Number;
	}
	public WebElement getBook_Now() {
		return book_Now;
	}
	
	
	
	
	
	
	
	
	

}
