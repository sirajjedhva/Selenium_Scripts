package testCase;

import java.io.IOException;
import java.util.Properties;

import operation.Readobject;
import operation.UIOperation;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import excelReading.ReadExcelFile;

public class ExecuteTest {
	
	@Test	
	public void testLogin() throws Exception{
		WebDriver driver=new FirefoxDriver();
		ReadExcelFile excel=new ReadExcelFile();
	    Readobject object=new Readobject();
	    Properties allObject=object.getObjectRepository();
	    UIOperation operation=new UIOperation(driver);
	    
	    //Read Keyword
	   // String path=System.getProperty("user.dir");
	   
	    Sheet sheet=excel.readExcel(System.getProperty("user.dir")+"/excelfile/" , "TestCase.xls", "KeywordFramework");
	    
	    //Find Number of Row
	    int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	   
	  //Create a loop over all the rows of excel file to read it
	    for(int i=1;i<rowCount+1;i++){
	    	Row row=sheet.getRow(i);
	    	 //Check if the first cell contain a value, if yes, That means it is the new testcase name
	        if(row.getCell(0).toString().length() ==0){
	        	  //Print testcase detail on console
	           System.out.println(row.getCell(1).toString()+"---"+row.getCell(2).toString()+row.getCell(3).toString()+"---"+row.getCell(4).toString());	
	        
	         //Call perform function to perform operation on UI
	           operation.perform(allObject, row.getCell(1).toString(),row.getCell(2).toString(),row.getCell(3).toString(),row.getCell(4).toString());
	        }else{
	        	//Print the new testcase name when it started
	        	System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
	        }
	    }
	}

}
