package Testes;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {

	
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	static String xl = "E://office_lap//selenium_projects//DOCNU//src//TestData//TestData.xlsx";
	
	static  String	 SheetName="Organization_Name";
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 
		 
		 Data_Driven.setExcelFile(xl, SheetName);
		 
		 System.out.println(SheetName);
		
	}

	
	public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file
			
			File file = new File(Path);
			
			//Create an object of FileInputStream class to read excel file
			
		FileInputStream ExcelFile = new FileInputStream(file);
		
		//ZipSecureFile.setMinInflateRatio(0.009d);

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e){

			throw (e);

		}

}
}
