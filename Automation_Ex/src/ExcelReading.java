import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.*;


public class ExcelReading {

	public static void main(String[] args) throws Exception {
		String filePath;
		String fileName;
		String sheetName;
       
		File f=new File("/home/inheritx_sales/test.xls");
		FileInputStream fis=new FileInputStream(f);
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
	
		HSSFSheet sheet=wb.getSheetAt(0);
				
	    String data=sheet.getRow(0).getCell(0).getStringCellValue();
	    System.out.println(data);
        
	 }
						
	}

	
