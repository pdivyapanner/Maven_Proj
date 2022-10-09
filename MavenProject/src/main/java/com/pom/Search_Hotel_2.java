package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_2 {
	
	public WebDriver driver;
	
	@FindBy(xpath= "//select[@id='location']")
	private WebElement location1;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel1;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room_Type1;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement room_Nos1;
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement datepick_In1;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement datepick_Out1;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult_Room1;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child_Room1;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit1;
	public Search_Hotel_2(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver,this);
	}
	public WebElement getLocation1() {
		return location1;
	}
	public WebElement getHotel1() {
		return hotel1;
	}
	public WebElement getRoom_Type1() {
		return room_Type1;
	}
	public WebElement getRoom_Nos1() {
		return room_Nos1;
	}
	public WebElement getDatepick_In1() {
		return datepick_In1;
	}
	public WebElement getDatepick_Out1() {
		return datepick_Out1;
	}
	public WebElement getAdult_Room1() {
		return adult_Room1;
	}
	public WebElement getChild_Room1() {
		return child_Room1;
	}
	public WebElement getSubmit1() {
		return submit1;
	}
	

}
