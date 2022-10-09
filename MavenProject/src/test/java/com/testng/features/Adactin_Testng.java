package com.testng.features;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.baseclass.Runner_with_Baseclass;
import com.page.manager.Page_Object_Manager;
import com.utility.UtilityFiles;

public class Adactin_Testng extends UtilityFiles {
	
	

	
	public static 	WebDriver driver = UtilityFiles.get_browser("chrome");
		
	//	public static Logger log = Logger.getLogger(Runner_with_Baseclass.class);
		
		public static	Page_Object_Manager manager = new Page_Object_Manager(driver);
		
		//public static void main(String[] args) throws Throwable {
			//PropertyConfigurator.configure("log4j.properties");
		//	log.info("info");
			@BeforeClass
			public void geturl() {
			geturl("https://adactinhotelapp.com/");
			}
			@Test
			public void gethotel() throws IOException{
			String name  = particular_cellData("C:\\Users\\user\\eclipse-workspace\\MavenProject\\excel.xlsx",1,5);
			send_Text(manager.getReservehotel().getEmail(),name);
			send_Text(manager.getReservehotel().getPassword(),"Kani@123");
			click_On_Element(manager.getReservehotel().getLogin());
			
			}
			@Test(dependsOnMethods = "gethotel")
			public void hotelname() throws InterruptedException {
			selectbyvalue(manager.getHotel().getLocation(),"Melbourne");
			selectbyvalue(manager.getHotel().getHotel(),"Hotel Sunshine");
			selectbyvalue(manager.getHotel().getRoom_Type(),"Deluxe");
			selectbyvalue(manager.getHotel().getRoom_Nos(),"2");
			clear_element(manager.getHotel().getDatepick_In());
			send_Text(manager.getHotel().getDatepick_In(),"16/09/2022");
			Thread.sleep(2000);
			clear_element(manager.getHotel().getDatepick_Out());
			send_Text(manager.getHotel().getDatepick_Out(),"20/09/2022");
			Thread.sleep(2000);
			selectbyvalue(manager.getHotel().getAdult_Room(),"3");
			selectbyvalue(manager.getHotel().getChild_Room(),"3");
			click_On_Element(manager.getHotel().getSubmit());
			}
			@Test(dependsOnMethods = "hotelname")
			public void continue_page() throws InterruptedException {
			click_On_Element(manager.getSelectHotel().getRadio_Button());
			click_On_Element(manager.getSelectHotel().getContinue_Button());
			}
			@Test(dependsOnMethods = "continue_page",timeOut = 15000)
			public void bookhote() throws InterruptedException  {
				
			send_Text(manager.getBook().getFirst_name(),"divya");
			send_Text(manager.getBook().getLast_Name(),"vinay");
			send_Text(manager.getBook().getAddress(),"gangaiamman koil street,nandambakkam");
			send_Text(manager.getBook().getCredit_card(),"236511236541236541");
			selectbyvalue(manager.getBook().getCard_type(),"MAST");
			selectbyvalue(manager.getBook().getExpiry_Month(),"4");
			selectbyvalue(manager.getBook().getExpiry_year(),"2022");
			send_Text(manager.getBook().getCvv_Number(),"4521");
			click_On_Element(manager.getBook().getBook_Now());
			Thread.sleep(10000);
			}
			
			@Test(dependsOnMethods = "bookhote")
			public void hotel2(){
			
			click_On_Element(manager.getHotel2().getSerchanotherHotel());
			
			}
			@Test(dependsOnMethods = "hotel2")
			public void hotel12() throws InterruptedException {
			selectbyvalue(manager.getHotel1().getLocation1(),"London");
			selectbyvalue(manager.getHotel1().getHotel1(),"Hotel Hervey");
			selectbyvalue(manager.getHotel1().getRoom_Type1(),"Standard");
			selectbyvalue(manager.getHotel1().getRoom_Nos1(),"2");
			clear_element(manager.getHotel1().getDatepick_In1());
			Thread.sleep(3000);
			send_Text(manager.getHotel1().getDatepick_In1(),"18/09/2022");
			clear_element(manager.getHotel1().getDatepick_Out1());
			Thread.sleep(3000);
			send_Text(manager.getHotel1().getDatepick_Out1(),"20/09/2022");
			selectbyvalue(manager.getHotel1().getAdult_Room1(),"1");
			selectbyvalue(manager.getHotel1().getChild_Room1(),"1");
			click_On_Element(manager.getHotel1().getSubmit1());
			}
			@Test(dependsOnMethods = "hotel12")
			public void  newHotel() throws InterruptedException {
			click_On_Element(manager.getHotelnew().getRadio_Button1());
			click_On_Element(manager.getHotelnew().getContinue_Button1());
			}
			@Test(dependsOnMethods = "newHotel")
			public void boo2() {
			send_Text(manager.getBook1().getFirst_name1(),"Divya");
			send_Text(manager.getBook1().getLast_Name1(),"v");
			send_Text(manager.getBook1().getAddress1(),"gangaiamman koil street,nandambakkam");
			send_Text(manager.getBook1().getCredit_card1(),"2365112456541236");
			selectbyvalue(manager.getBook1().getCard_type1(),"VISA");
			selectbyvalue(manager.getBook1().getExpiry_Month1(),"4");
			selectbyvalue(manager.getBook1().getExpiry_year1(),"2022");
			send_Text(manager.getBook1().getCvv_Number1(),"4221");
			click_On_Element(manager.getBook1().getBook_Now1());
			}
			@Test
			public void snap() throws IOException
			{
			takesscreenshot("C:\\Users\\user\\eclipse-workspace\\MavenProject\\screenshot\\adactin1.png");

			}
			
			
			
			
			
			
			
			
			
		
		

	}




	
	


