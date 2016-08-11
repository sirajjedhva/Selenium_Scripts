package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

public class ReadExcelFile {
	HSSFWorkbook wb=null;
	public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException {
		// TODO Auto-generated constructor stub
		
			/*String path=System.getProperty("user.dir");	
			System.out.println(path+"/excelfile/TestCase.xls");*/
		File file=new File(filePath+"//"+fileName);
		FileInputStream fis=new FileInputStream(file);
		
		 wb=new HSSFWorkbook(fis);
		//HSSFSheet sheet=wb.getSheet(sheetName);
		/*if(sheet==null){
			System.out.println("Sheet is null");
		}*/
		
		 Sheet sheet=wb.getSheet(sheetName);
			
		
		return sheet;
	
	}

}
