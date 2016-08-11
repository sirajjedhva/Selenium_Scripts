package readExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;


public class ExcelReading {
	HSSFWorkbook wb;
	public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException {
		File file=new File(filePath+"//"+fileName);
		
		FileInputStream fis=new FileInputStream(file);
		
		wb=new HSSFWorkbook(fis);
		
		
		Sheet sheet=wb.getSheet(sheetName);
		
		return sheet;
	}

}
