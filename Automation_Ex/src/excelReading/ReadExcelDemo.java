package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class ReadExcelDemo {


	public void GetDataFromExcelFile(String FilePath, String FileName, String SheetName) throws IOException
	{
		File file= new File(FilePath+"//"+FileName);
		System.out.println("Entire file name is : "+file);
		System.out.println("Sheet name is : "+SheetName);
		FileInputStream inputStream= new FileInputStream(file);	// making file as inputstream for reading data from it
		
		Workbook guru99DemoWorkbook = null;
		
		String FileExtensionName= FileName.substring(FileName.indexOf("."));
		System.out.println(FileExtensionName);
		
		if(FileExtensionName.equals(".xlsx"))
		{
			guru99DemoWorkbook = new XSSFWorkbook(inputStream);
			
		}
		else if (FileExtensionName.equals(".xls"))
		{
			guru99DemoWorkbook = new HSSFWorkbook(inputStream);
		}
		
		Sheet guru99DemoSheet = guru99DemoWorkbook.getSheet(SheetName);
		 
		int rowCount= guru99DemoSheet.getLastRowNum()-guru99DemoSheet.getFirstRowNum();
		System.out.println("rowCount : "+ rowCount);
		for(int i=0; i< rowCount; i++) // reading rows
		{
			Row rows = guru99DemoSheet.getRow(i); // getting rows
			
			for(int j=0; j<rows.getLastCellNum();j++) // getting columns i.e cells
			{
				System.out.print(rows.getCell(j).getStringCellValue() + "||");
			}
			
			System.out.println("\n");
			
		}
		
	
		
	}
	
	public static void main(String...strings) throws IOException {
		
		ReadExcelDemo objData = new ReadExcelDemo();
		
		
		String FilePath = System.getProperty("user.dir");
		
		//System.out.println(FilePath);
		objData.GetDataFromExcelFile(FilePath, "Guru99ExcelReadTest.xlsx", "ReadDemoSheet");
	}


}
