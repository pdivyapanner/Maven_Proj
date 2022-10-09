package read.write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Demo {
	
	public static void write() throws IOException {
	File f = new File("C:\\Users\\user\\Desktop\\excel.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	
	wb.createSheet("Student_Data").createRow(0).createCell(0).setCellValue("Email");
	wb.getSheet("Student_Data").getRow(0).createCell(1).setCellValue("pass");
	wb.getSheet("Student_Data").createRow(1).createCell(0).setCellValue("starc");
	wb.getSheet("Student_Data").getRow(1).createCell(1).setCellValue(56);
	
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	}
	public static void main(String[] args) throws IOException {
		write();
	}
	

}
