package exelTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class firstExelTest {
	
	public static void main(String[] args) throws IOException  {
		
		
		
		String excelPath = "/Users/yusan/eclipse-workspace/internatinalWomensDay/src/test/resources/DataFolder/data .xlsx";
		FileInputStream fc = new FileInputStream(excelPath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fc);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(0);
		
		///DataFormatter objede = new DataFormatter();
		
		System.out.println("1 - " +sheet.getRow(0).getCell(0));
		
		// for(Row row1: sheet) {
			 
			// for(Cell ceel1: row1) {
				 
				 
				// String cellvalue = objede.formatCellValue(ceel1);
				// System.out.println(cellvalue + "| ");
				 
			 }
			 
		 
		
		
		
	}


