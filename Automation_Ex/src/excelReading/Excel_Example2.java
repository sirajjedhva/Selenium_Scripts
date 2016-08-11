package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_Example2 {
	
	public static void main(String args[]) throws IOException{
		
		File file=new File("/home/inheritx_sales/TestData.xls");
		
		FileInputStream fis=new FileInputStream(file);
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		
		HSSFSheet sheet=wb.getSheetAt(0);
		
		//print single row
		//String data=sheet.getRow(0).getCell(0).getStringCellValue();
		//print rows data
		int rowCount=sheet.getLastRowNum()+1;
		
		System.out.println(rowCount);
		for(int i=0;i<rowCount;i++){
			HSSFRow row=sheet.getRow(i);
			//print cell value
			
			for(int j=0;j<row.getLastCellNum();j++){
				//HSSFCell cell=row.getCell(j);
				/*String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);*/
				System.out.print(row.getCell(j).getStringCellValue()+"||");
				
			}
			System.out.println();
			
		}
		/*System.out.println(data);*/
	}

}
