package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Practice {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("divyavin");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Kani@123");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(location);
		s.selectByValue("Melbourne");
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(room);
		s2.selectByValue("Deluxe");
		WebElement roomnos = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(roomnos);
		s3.selectByValue("2");
		WebElement datepickin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		datepickin.clear();
		datepickin.sendKeys("16/09/2022");
		Thread.sleep(2000);
		WebElement datepickout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		datepickout.clear();
		datepickout.sendKeys("20/09/2022");
		Thread.sleep(2000);
		WebElement adultroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(adultroom);
		s4.selectByValue("3");
		WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(childroom);
		s4.selectByValue("3");
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
		Thread.sleep(3000);
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		radiobutton.click();
		WebElement confirm = driver.findElement(By.xpath("//input[@id='continue']"));
		confirm.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("divya");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("vinay");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("gangaiamman koil street,nandambakkam");
		WebElement credit = driver.findElement(By.xpath("//input[@id='cc_num']"));
		credit.sendKeys("236511236541236541");
		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s6 = new Select(cardtype);
		s6.selectByValue("MAST");
		WebElement expiry = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s7= new Select(expiry);
		s7.selectByValue("4");
		WebElement expirymonth = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s8= new Select(expirymonth);
		s8.selectByValue("2014");
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("4521");
		WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
		booknow.click();
		Thread.sleep(10000);
		WebElement searchHotel2 = driver.findElement(By.xpath("//input[@id='search_hotel']"));
		searchHotel2.click();
		Thread.sleep(5000);
		WebElement location1 = driver.findElement(By.xpath("//select[@id='location']"));
		Select sc = new Select(location1);
		sc.selectByValue("London");
		WebElement hotel1 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select sc1 = new Select(hotel1);
		sc1.selectByValue("Hotel Hervey");
		WebElement room_Type = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select sc2 = new Select(room_Type);
		sc2.selectByValue("Standard");
		WebElement no_of_rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select sc3 = new Select(no_of_rooms);
		sc3.selectByValue("2");
		WebElement date_in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		date_in.clear();
		Thread.sleep(3000);
		date_in.sendKeys("18/09/2022");
		WebElement date_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		date_out.clear();
		Thread.sleep(3000);
		date_out.sendKeys("20/09/2022");
		WebElement adult_Room = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select sc5 = new Select(adult_Room);
		sc5.selectByValue("1");		
		WebElement child_Room = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select sc6 = new Select(child_Room);
		sc6.selectByValue("1");		
		WebElement submit_S = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit_S.click();
		Thread.sleep(3000);
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		radioButton.click();
		WebElement tocontinue = driver.findElement(By.xpath("//input[@id='continue']"));
		tocontinue.click();
		Thread.sleep(2000);
		WebElement first_Name = driver.findElement(By.xpath("//input[@id='first_name']"));
		first_Name.sendKeys("Divya");
		WebElement last_Name = driver.findElement(By.xpath("//input[@id='last_name']"));
		last_Name.sendKeys("v");
		WebElement address1 = driver.findElement(By.xpath("//textarea[@name='address']"));
		address1.sendKeys("gangaiamman koil street,nandambakkam");
		WebElement credit_card_Number = driver.findElement(By.xpath("//input[@id='cc_num']"));
		credit_card_Number.sendKeys("2365112456541236");
		WebElement card_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select sc0 = new Select(card_type);
		sc0.selectByValue("VISA");
		WebElement expiry_Date = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select sc7= new Select(expiry_Date);
		sc7.selectByValue("4");
		WebElement expiry_month = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select sc8= new Select(expiry_month);
		sc8.selectByValue("2022");
		WebElement cvv_no = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv_no.sendKeys("4221");
		WebElement booknow1 = driver.findElement(By.xpath("//input[@id='book_now']"));
		booknow1.click();
		driver.close();
		
		
		
	}
	

}
