package excelReading;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SQA_ExcelReading {

	public static void main(String args[]) throws IOException, InterruptedException{
    File src = new File("/home/inheritx_sales/mutiselect.xlsx");

  
   
    // Load file
    FileInputStream fis = new FileInputStream(src);

    // Load WB
    XSSFWorkbook wb = new XSSFWorkbook(fis);

    // Load Sheet
    XSSFSheet sh1 = wb.getSheetAt(0);


    List<String> values = new ArrayList<String>();  //values from excel will be stored within this array

   Iterator<Row> rows = sh1.rowIterator();

     
    while (rows.hasNext()) 
    {

        Row row = rows.next();

       
        if (row.getRowNum() > 0 && row.getCell(1) != null) 
      // if (row.getRowNum() > 0) 
        {
        	//values.add(row.getCell(1).getStringCellValue());
			
        	try {
        		
        		values.add(row.getCell(1).getStringCellValue());
				
			} catch (Exception e) {
				// TODO: handle exception
				values.add("");
			}
            

        }
    }

    System.out.println(values);


    Thread.sleep(2000);


    List<String> values2 = new ArrayList<String>();  //values from excel will be stored within this array

    Iterator<Row> rows2 = sh1.rowIterator();


    while (rows2.hasNext()) 
    {

        Row row2 = rows2.next();

        if (row2.getRowNum() > 0 && row2.getCell(2) != null) 
        //if (row2.getRowNum() > 0) 
        {
          try{
        	  values2.add(row2.getCell(2).getStringCellValue()); 
          }catch(Exception e){
            values2.add("");
          }
        }
    }

    System.out.println(values2);

    fis.close();
    
}
}
