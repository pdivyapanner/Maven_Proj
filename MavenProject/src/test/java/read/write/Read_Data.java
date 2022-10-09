package read.write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Read_Data {

	public static void particular_cellData() throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		Cell cel = r.getCell(1);
		CellType type = cel.getCellType();
		if (type.equals(CellType.STRING)) {
			String value = cel.getStringCellValue();
			System.out.println(value);
		} else if (type.equals(CellType.NUMERIC)) {

			double d = cel.getNumericCellValue();
			int a = (int) d;
			String value = String.valueOf(a);
			System.out.println(value);
		}
		wb.close();

	}
@DataProvider
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
	public static void particular_Row() throws IOException {

		File f = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row row = s.getRow(3);
		for (int i = 0; i < 2; i++) {
			Cell cell = row.getCell(i);
			System.out.println(cell);
		}
		wb.close();
	}

	public static void particular_Column() throws IOException {

		File f = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i < 5; i++) {
			Row row = s.getRow(i);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			String stringval = cell.getStringCellValue();
			System.out.println(stringval);
		}
		else if(cellType.equals(CellType.NUMERIC)) {
			double d = cell.getNumericCellValue();
			int a = (int) d;
			String s1 = String.valueOf(a);
			System.out.println(s1);
		
		}
		}
	}

	public static void main(String[] args) throws IOException {
		 //particular_cellData();
		all_data();
		 //particular_Row();
		//particular_Column();

	}

}
