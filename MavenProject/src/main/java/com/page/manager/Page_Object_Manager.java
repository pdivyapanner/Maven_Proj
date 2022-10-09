package com.page.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Book_A_Hotel;
import com.pom.Book_A_Hotel2;
import com.pom.Hotel_Reservation;
import com.pom.Search_Another_Hotel;
import com.pom.Search_Hotel;
import com.pom.Search_Hotel_2;
import com.pom.Select_Hotel;
import com.pom.Select_Hotel2;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
private Hotel_Reservation reservehotel;
private Search_Hotel hotel;
private Select_Hotel selectHotel;
private Book_A_Hotel book;
private Search_Another_Hotel hotel2;
private Search_Hotel_2 hotel1;
private Select_Hotel2 hotelnew;
private Book_A_Hotel2 book1;


public Page_Object_Manager(WebDriver driver2) {
	
	this.driver = driver2;
	//PageFactory.initElements(driver,this);
	
}
public Hotel_Reservation getReservehotel() {
reservehotel = new Hotel_Reservation(driver);
	return reservehotel;
}
public Search_Hotel getHotel() {
	
	
		
		hotel = new Search_Hotel(driver);
	
	return hotel;
}
public Select_Hotel getSelectHotel() {
if(selectHotel==null) {
		
		selectHotel = new Select_Hotel(driver);
	}
	
	return selectHotel;
}
public Book_A_Hotel getBook() {
	if(book==null) {
		book = new Book_A_Hotel(driver);
	}
	return book;
}
public Search_Another_Hotel getHotel2() {
	hotel2 = new Search_Another_Hotel(driver);
	return hotel2;
}
public Search_Hotel_2 getHotel1() {
if(hotel1==null) {
		
		hotel1 = new Search_Hotel_2(driver);
	}
	
	return hotel1;
}
public Select_Hotel2 getHotelnew() {
if(hotelnew==null) {
		
		hotelnew = new Select_Hotel2(driver);
	}

	return hotelnew;
}
public Book_A_Hotel2 getBook1() {
	if(book1==null) {
		book1 = new Book_A_Hotel2(driver);
	}
	return book1;
}



}
