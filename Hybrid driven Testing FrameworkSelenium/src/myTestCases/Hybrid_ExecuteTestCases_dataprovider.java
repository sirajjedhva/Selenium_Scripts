package myTestCases;


import java.io.IOException;
import java.util.Properties;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import myExcelFileReader.ExcelReaderFile;
import myOperations.UI_Operations;
import myOperations.readFacebookObjects;
//import myOperations.readObjects;

public class Hybrid_ExecuteTestCases_dataprovider {
	 
	// WebDriver driver=null;
	WebDriver driver= new FirefoxDriver();
	
  @Test(dataProvider= "getData")
  
  public void HybridExecuteClass(String testCaseName, String keyword, String ObjectName, String ObjectType, String value) throws Exception {
	  
	
	  /*if(testCaseName!=null && testCaseName.length()!=0)
	  {
		  driver= new FirefoxDriver();
	  }*/
	  
	  UI_Operations operation =new UI_Operations(driver);
	 // readObjects object= new readObjects();
	  readFacebookObjects object = new readFacebookObjects();
	  Properties allobjects = object.getObjectRepository();
	  operation.perform_keywords(allobjects, keyword,ObjectName, ObjectType, value);
	  Thread.sleep(3000);
  }
  
  @DataProvider(name="getData")
  
  public Object [][] dataProviderClass() throws IOException
  {
	  ExcelReaderFile  file= new ExcelReaderFile();
	 
	 
	  
	  Sheet guruDemo99Sheet = file.ReadDataFromExcelFile("/home/inheritx_sales/workspace/Hybrid driven Testing FrameworkSelenium/src/","TestCase.xlsx", "facebook_keywordFramework");
	  
	  
	  int rowCount = guruDemo99Sheet.getLastRowNum() - guruDemo99Sheet.getFirstRowNum();
	  
	 Object[][] obj = new Object[rowCount][5];
	 System.out.println(rowCount+1);
	  for(int i=0; i< rowCount ; i++)
	  {
		  Row rows= guruDemo99Sheet.getRow(i+1);
		  
		  for(int j=0;j< rows.getLastCellNum();j++)
		  {
			  obj[i][j]= rows.getCell(j).toString();
		  }
		  
	  }
	  System.out.println("");
	  return  obj;
  } 
  }

