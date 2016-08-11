package testCase;

import java.io.IOException;
import java.util.Properties;

import operation.UiOperation;
import operation.objectload;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import readExcelFile.ExcelReading;


public class HybridTestCase {
	WebDriver driver;
	
	@Test(dataProvider="hybridData")
	public void testLogin(String testcaseName,String keyword,String objectName,String objectType,String value) throws Exception{
		
		if(testcaseName !=null && testcaseName.length() !=0){
			 driver=new FirefoxDriver();
		}
		objectload object=new objectload();
		Properties allObject=object.getObjectRepository();
		UiOperation opertion=new UiOperation(driver);
		
				opertion.perform(allObject, keyword, objectName, objectType, value);
	}
	
	@DataProvider(name="hybridData")
	public Object[][] getDataFromDataprovider() throws IOException{
		Object[][] object=null;
		
		ExcelReading excel=new ExcelReading();
		
		Sheet guru=excel.readExcel(System.getProperty("user.dir")+"/","TestCase.xls", "KeywordFramework");
		int rowCount=guru.getLastRowNum()-guru.getFirstRowNum();
		
		object=new Object[rowCount][5];
		for(int i=0;i<rowCount;i++){
			Row row=guru.getRow(i+1);
			for(int j=0;j<row.getLastCellNum();j++){
				object[i][j]=row.getCell(j).toString();
			}
		}
		System.out.println("");
		return object;
	}
}
