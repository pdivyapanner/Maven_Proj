package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel2 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first_name1;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement last_Name1;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address1;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement credit_card1;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement card_type1;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expiry_Month1;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expiry_year1;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv_Number1;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_Now1;
	public Book_A_Hotel2(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver,this);
	
	}
	public WebElement getFirst_name1() {
		return first_name1;
	}
	public WebElement getLast_Name1() {
		return last_Name1;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getCredit_card1() {
		return credit_card1;
	}
	public WebElement getCard_type1() {
		return card_type1;
	}
	public WebElement getExpiry_Month1() {
		return expiry_Month1;
	}
	public WebElement getExpiry_year1() {
		return expiry_year1;
	}
	public WebElement getCvv_Number1() {
		return cvv_Number1;
	}
	public WebElement getBook_Now1() {
		return book_Now1;
	}
	

}
