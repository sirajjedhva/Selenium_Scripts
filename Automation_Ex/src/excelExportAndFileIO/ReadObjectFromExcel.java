package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadObjectFromExcel {

	public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException{
		
		File file=new File(filePath+"/home/inheritx_sales/TestCase.xlsx"+fileName);
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wb=null;
		wb=new HSSFWorkbook(fis);
		//Sheet sheet=(Sheet) wb.getSheetAt(0);
		Sheet sheet=wb.getSheet(sheetName);
		return sheet;
		
	}

}
