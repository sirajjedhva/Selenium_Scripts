package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_Example {
	
	public static void main(String args[]) throws IOException{
		File file=new File("/home/inheritx_sales/TestData.xls");
		FileInputStream fis=new FileInputStream(file);
		
		System.out.println("Excel Located");
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		System.out.println("workbook located");
		
		HSSFSheet sheet=wb.getSheetAt(0);
		System.out.println("Sheet loaded");
		
		String data=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		data=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		wb.close();
		
	}

}
