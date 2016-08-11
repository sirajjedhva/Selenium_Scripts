package PDFEmail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
   
	static WebDriver driver;
	public static WebDriver getDriver(){
		
		if(driver == null){
			driver=new FirefoxDriver();
			
		}
		return driver;
	}
	

    /**
 
     * This function will take screenshot
 
     * @param webdriver
 
     * @param fileWithPath
     * @throws IOException 
 
     * @throws Exception
 
     */
	
	public static void takeScreenShot(WebDriver driver,String filePath) throws IOException{
		TakesScreenshot srch=(TakesScreenshot) driver;
		File file=srch.getScreenshotAs(OutputType.FILE);
		
		File dst=new File(filePath);
		
		FileUtils.copyFile(file, dst);
	}
}
