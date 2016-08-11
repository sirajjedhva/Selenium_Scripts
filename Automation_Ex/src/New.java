import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.FormulaEvaluator;

public class New {

	public static void main(String[] args) throws IOException {
		File excel = new File("/home/inheritx_sales/test.xls");
		FileInputStream fis = new FileInputStream(excel);
		//OR
		//FileInputStream fis = new FileInputStream("/home/likewise-open/INHERITXPDC/abbasali/test.xls");
		System.out.println("pass");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowNum = ws.getLastRowNum()+1;
		int colNum = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rowNum][colNum];
		System.out.println(data);
		for (int i = 0; i < rowNum; i++) {
			HSSFRow row = ws.getRow(i);
			for (int j = 0; j < colNum; j++) {
				HSSFCell cell = row.getCell(j);
				String value = cellToString(cell);
				data[i][j] = value;
				System.out.println("The value is " + value);
			}
		}
		
		
	}
	private static String cellToString(HSSFCell cell){
	  int type;
	  Object result;
	  type = cell.getCellType();
	  
	  switch(type){
	  case 0:
	  	result = cell.getNumericCellValue();
	  	break;
	  case 1:
	  	result= cell.getStringCellValue();
	  	break;
	  default:
		throw new RuntimeException("Hello");
	  }
	  return result.toString();
	}

}