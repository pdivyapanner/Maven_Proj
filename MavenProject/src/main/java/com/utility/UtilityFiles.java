package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityFiles {

	public static WebDriver driver;
	public static Workbook wb;
	public static String value;

	public static void click_On_Element(WebElement element) {

		element.click();
	}

	public static void clear_element(WebElement ele) {
		ele.clear();
	}

	public static void send_Text(WebElement text, String value) {
		text.sendKeys(value);

	}

	public static String get_text(WebElement gettext) {
		String text = gettext.getText();
		return text;

	}

	public static boolean isDisplayed(WebElement display) {

		boolean displayed = display.isDisplayed();
		return displayed;

	}

	public static boolean isenabled(WebElement enable) {
		boolean enabled = enable.isEnabled();
		return enabled;

	}

	public static boolean isselected(WebElement element) {

		boolean selected = element.isSelected();
		return selected;

	}

	public static void selectbyindex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void selectbyvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void selectbyText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}

	public static String getTagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	public static void getSize(WebElement element) {

		element.getSize();
	}

	public static boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public static boolean issingle(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;

	}

	public static void close() {

		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static String gettitle() {

		String title = driver.getTitle();
		return title;
	}

	public static void geturl(String url) {

		driver.get(url);
	}

	public static WebDriver get_browser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\Chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\edgedriver.exe");
			driver = new EdgeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	
	public static void takesscreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

	}

	public static String getPageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;

	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void navigate(String url) {
		driver.navigate().to(url);
	}

	public static void switchTo() {
		driver.switchTo();
	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();

	}

	public static void switchToframe(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchToframe(String name) {
		driver.switchTo().frame(name);
	}

	public static void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}
	public static String particular_cellData(String path,int row,int cell) throws IOException {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		 wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(1);
		Row r = s.getRow(row);
		Cell cel = r.getCell(cell);
		CellType type = cel.getCellType();
		if (type.equals(CellType.STRING)) {
			 value = cel.getStringCellValue();
			System.out.println(value);
		} else if (type.equals(CellType.NUMERIC)) {

			double d = cel.getNumericCellValue();
			int a = (int) d;
			value = String.valueOf(a);
			System.out.println(value);
		}
		
		wb.close();
		return value;

	}

	public static String[][] all_data() throws IOException {

		File f = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		int totalrows = s.getPhysicalNumberOfRows();
		Row row = s.getRow(0);
		int noofcells = row.getPhysicalNumberOfCells();
		String[][] data = new String[totalrows][noofcells];
				for (int i = 0; i < totalrows; i++) {
			Row row1 = s.getRow(i);
			for (int j = 0; j < noofcells; j++) {
				Cell cel = row1.getCell(j);
				CellType cellType = cel.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String value = cel.getStringCellValue();
					data[i][j] = value;
				} else if (cellType.equals(CellType.NUMERIC)) {
					double d = cel.getNumericCellValue();
					int a = (int) d;
					String value = String.valueOf(a);
					data[i][j] = value;
				}
			//	System.out.println(data[i][j]);
		}
		wb.close();
			}
		return data;
	}
	
	public static String particular_Row(String path,int row1) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row row = s.getRow(row1);
		int noOfCell = row.getPhysicalNumberOfCells();
		for (int i = 0; i < noOfCell; i++) {
			Cell value = row.getCell(i);
			System.out.println(value);
		}
		wb.close();
		return value;
	}

	public static String particular_Column(String path) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		int noOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {
			Row row = s.getRow(i);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if(cellType.equals(CellType.NUMERIC)) {
			double d = cell.getNumericCellValue();
			int a = (int) d;
			String value = String.valueOf(a);
			System.out.println(value);
		
		}
		}
		wb.close();
		return value;
		
	}
public static void action_Move(WebElement target) {

	Actions ac = new Actions(driver);
	ac.moveToElement(target).build().perform();
}
public static void action_click(WebElement element) {
	
	
	Actions ac = new Actions(driver);
	ac.click(element).build().perform();;
}


}



