package Testes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;


	
	//private static XSSFRow xRow;
	

//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

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
	
	

//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

public static String getCellData( int RowNum, int ColNum) throws Exception{
	
	
		try{
			
		
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			
		

			String CellData = Cell.getStringCellValue();
			//System.out.println(CellData);
			
			return CellData;

			}catch (Exception e){

			return"";

			}
		
		
		

}


//create new method getcell data for new patient registeration

public static String getCellData_patinet( int RowNum, int ColNum) throws Exception{
	
	
	
	try{
	
		
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		
		
	

		String CellData = Cell.getStringCellValue();
		System.out.println(CellData);
		
		return CellData;
		
		

		}catch (Exception e){

		return"";

		}
	
		
}

public static int getRowCount (String xl, String Sheet)

{

    try

         {

            FileInputStream fis = new FileInputStream(xl);

             Workbook wb = WorkbookFactory.create(fis);
    	

             return ExcelWSheet.getLastRowNum();

                }

                catch (Exception e)

                {

                  return 0;

                }

}

public static int getColCount (String xl, String Sheet)

{

    try

         {

            // FileInputStream fis = new FileInputStream(xl);

            // Workbook wb = WorkbookFactory.create(fis);
    	
Row=ExcelWSheet.getRow(0);
int colCount=Row.getLastCellNum();
             return colCount;

                }

                catch (Exception e)

                {

                  return 0;

                }

}


		 

//This method is to write in the Excel cell, Row num and Col num are the parameters

public static int setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

	
		try{
			Row = ExcelWSheet.getRow(RowNum);
			Cell=Row.getCell(ColNum);
			//
		
		
		System.out.println(Cell);
		if (Cell == null) {

			Cell = Row.createCell(ColNum);

			Cell.setCellValue(Result);
			

			} else {

				Cell.setCellValue(Result);

			}
	
		
		 
		    
	


// Constant variables Test Data path and Test Data file name

				FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

				//ExcelWBook.write(fileOut);
				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			} catch(Exception e){

				throw (e);

		}
		return ColNum;

	}

public static int getRowCountInSheet(){
	 
    int rowcount = ExcelWSheet.getLastRowNum()-ExcelWSheet.getFirstRowNum();
    return rowcount;
 }


}
