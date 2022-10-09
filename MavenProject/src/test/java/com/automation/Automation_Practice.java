package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.pom.Casual_Dress;
import com.automation.pom.Evening_Dress;
import com.automation.pom.My_Store;
import com.automation.pom.Order1;
import com.automation.pom.Order_Page;
import com.pom.automation.PageObjectManager;
import com.utility.UtilityFiles;

public class Automation_Practice extends UtilityFiles {
	public static WebDriver driver = UtilityFiles.get_browser("chrome");
	public static PageObjectManager manager = new PageObjectManager(driver);
	public static void main(String[] args) throws Exception {
		
		geturl("http://automationpractice.com/index.php");
	click_On_Element(manager.getStore().getSignin());
	send_Text(manager.getStore().getEmail(), "kanikutty2013@gmail.com");
	send_Text(manager.getStore().getPassword(),"Kani@123");
		click_On_Element(manager.getStore().getSubmit());
		Thread.sleep(3000);
//		action_Move(manager.getDress().getDresses());
//		action_Move(manager.getDress().getCasualdress());
//		action_click(manager.getDress().getCasualdress());
//		action_Move(manager.getDress().getImage());
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(manager.getDress().getQuickview()));	
//		action_Move(manager.getDress().getQuickview());
//		action_click(manager.getDress().getQuickview());
//		driver.switchTo().frame(0);
//		click_On_Element(manager.getDress().getAddtocart());
//		Thread.sleep(8000);
//		action_Move(manager.getDress().getProceedToCheck());
//		action_click(manager.getDress().getProceedToCheck());
//		
//		click_On_Element(manager.getOrder().getShip());
//		Thread.sleep(4000);
//		click_On_Element(manager.getOrder().getAddress());
//		Thread.sleep(3000);
//		click_On_Element(manager.getOrder().getContinueshoping());
//		Thread.sleep(5000);
//		click_On_Element(manager.getOrder().getConfirm());
//		
		action_Move(manager.getEvening().getDresses1());
		action_click(manager.getEvening().getEveningDress());
		action_Move(manager.getEvening().getImage1());
		
		click_On_Element(manager.getEvening().getQuickview1());
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		action_Move(manager.getEvening().getIcon());
		action_click(manager.getEvening().getIcon());
		selectbyvalue(manager.getEvening().getSize(),"3");
		click_On_Element(manager.getEvening().getColor());
		click_On_Element(manager.getEvening().getAdd());
		Thread.sleep(5000);
		click_On_Element(manager.getEvening().getProceed2());
		Thread.sleep(5000);
		click_On_Element(manager.getPayment().getShip1());
		Thread.sleep(4000);
		click_On_Element(manager.getPayment().getAddress1());
		Thread.sleep(3000);
		
		click_On_Element(manager.getPayment().getCheckbox());
		
		click_On_Element(manager.getPayment().getShipping());
		Thread.sleep(2000);
		click_On_Element(manager.getOrder().getContinueshoping());
		Thread.sleep(5000);
		
		click_On_Element(manager.getOrder().getConfirm());
		Thread.sleep(2000);
		
		click_On_Element(manager.getPayment().getLogout());
	
	
	}
	
	

}
