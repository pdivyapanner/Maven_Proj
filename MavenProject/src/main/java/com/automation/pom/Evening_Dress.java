package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dress {
	public WebDriver driver;
	
	@FindBy(xpath = "//li[@id='category-thumbnail']//following::a")
	private WebElement dresses1;
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/ul/li[2]/a")
	private WebElement eveningDress;
	@FindBy(xpath = "//a[@class='product_img_link']/img")
	private WebElement image1;
	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement quickview1;
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement icon;
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size;
	@FindBy(xpath = "//a[@id='color_24']")
	private WebElement color;
	@FindBy(xpath = "//p[@id='add_to_cart']//following::button[@type='submit']")
	private WebElement add;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed2;
	public Evening_Dress(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver,this);
	
	
	}
	public WebElement getDresses1() {
		return dresses1;
	}
	public WebElement getEveningDress() {
		return eveningDress;
	}
	public WebElement getImage1() {
		return image1;
	}
	public WebElement getQuickview1() {
		return quickview1;
	}
	public WebElement getIcon() {
		return icon;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getColor() {
		return color;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getProceed2() {
		return proceed2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
