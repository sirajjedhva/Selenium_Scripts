package myExcelFileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public  class ExcelReaderFile {


	public Sheet ReadDataFromExcelFile(String FilePath, String FileName, String SheetName) throws IOException
	{
		File file= new File(FilePath+"/"+FileName);
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
		 
		return guru99DemoSheet;
		
	
		
	}
	
	

}
