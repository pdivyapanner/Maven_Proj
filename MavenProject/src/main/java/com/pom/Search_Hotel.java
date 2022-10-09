package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath= "//select[@id='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room_Type;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement room_Nos;
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement datepick_In;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement datepick_Out;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult_Room;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child_Room;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;
	
	public Search_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom_Type() {
		return room_Type;
	}
	public WebElement getRoom_Nos() {
		return room_Nos;
	}
	public WebElement getDatepick_In() {
		return datepick_In;
	}
	public WebElement getDatepick_Out() {
		return datepick_Out;
	}
	public WebElement getAdult_Room() {
		return adult_Room;
	}
	public WebElement getChild_Room() {
		return child_Room;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
}
