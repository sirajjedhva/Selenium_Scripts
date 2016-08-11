package excelWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
  
	public void writeExcel(String filepath,String filename,String sheetName,String[] dataToWrite){
		try{
			//Create a object of File class to open xlsx file
			File file=new File(filepath + "//" + filename);
			
			  //Create an object of FileInputStream class to read excel file
			FileInputStream fis=new FileInputStream(file);
			
			Workbook wb=null;
			
			 //Find the file extension by spliting file name in substing and getting only extension name
			String FileExtention=filename.substring(filename.indexOf("."));
			
			//Check condition if the file is xlsx file
			if(FileExtention.equals(".xlsx")){
				wb=new XSSFWorkbook(fis);
			}
			else if(FileExtention.equals(".xls")){
				wb=new HSSFWorkbook(fis);
			}
			//Read excel sheet by sheet name 
			Sheet sheet=wb.getSheet(sheetName);
			//Get the current count of rows in excel file
			int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
			
			//Get the first row from the sheet
			Row row=sheet.getRow(0);
			
			 //Create a new row and append it at last of sheet
			Row newRow=sheet.createRow(rowCount+1);
			
			//Create a loop over the cell of newly created Row
			for(int j=0;j<row.getLastCellNum();j++){
				//Fill data in row
				Cell cell =newRow.createCell(j);
				cell.setCellValue(dataToWrite[j]);
			}
			
			//Close input stream
			fis.close();
			
			//Create an object of FileOutputStream class to create write data in excel file
			FileOutputStream fos=new FileOutputStream(file);
			
			//write data in the excel file
			wb.write(fos);
	
		    //Close outstream
			fos.close();
		}catch(Exception e){
			e.printStackTrace();		}
		
	}
	 public static void main(String...strings) throws IOException{
		 
	        //Create an array with the data in the same order in which you expect to be filled in excel file
	        String[] valueToWrite = {"Mr. E","Noida"};
	       
	        //Create an object of current class
	        ExcelWrite objExcelFile = new ExcelWrite();	 
	       
	        String path=System.getProperty("user.dir");
	        System.out.println(path);
	        //Write the file using file name , sheet name and the data to be filled
	        objExcelFile.writeExcel(path,"ExportExcel.xlsx","ExcelGuru99Demo",valueToWrite);
	 
	    }


}
