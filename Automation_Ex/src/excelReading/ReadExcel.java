package excelReading;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file=new File("/home/inheritx_sales/TestData.xls");
		FileInputStream fis=new FileInputStream(file);
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		
		HSSFSheet sheet=wb.getSheetAt(0);
		
	    int rowCount=sheet.getLastRowNum()+1;
	   
	    System.out.println(rowCount);
		
		
		
		for(int i=0;i<rowCount;i++){
			/*HSSFRow row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++){
				System.out.println(row.getCell(j).getStringCellValue()+"..");
			}*/
				
			String data=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		
		
		}
	}
}


