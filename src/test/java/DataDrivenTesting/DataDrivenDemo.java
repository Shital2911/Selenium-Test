package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenDemo {

	public static void main(String[] args) 
	{
		//excel>workbook>sheet>row>cell
		XSSFWorkbook workbook = null;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		
//		Create an object of file class to open file
		File excelFile = new File("C:\\Users\\Shital Motghare\\Downloads");
		try {
			FileInputStream inputstream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create object of XSSFWorkbook to handle the excel file
		
		workbook = new XSSFWorkbook(inputstream);
		sheet = workbook.getSheetAt(0);
		row = sheet.getRow(0);
		cell = row.getCell(0);
		
		int ttlrows = sheet.getLastRowNum()+1;
		
	
	}

}
