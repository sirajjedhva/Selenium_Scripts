package myOperations;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class UI_Operations {
	
	WebDriver driver;
	public UI_Operations(WebDriver driver) 	// constructor to define web driver whose argument comes from execute class 
	{
		this.driver= driver;
		
	}
	
	/*Find elements by keywords i.e. operations*/
	public void perform_keywords(Properties p,String operations, String ObjectName, String ObjectType, String value) throws Exception // method to perform UI operations 
	{
		switch(operations.toUpperCase())
		{
		case "CLICK" :
			driver.findElement(this.getObject(p,ObjectName,ObjectType)).click();
			break;
			
		case "GETTEXT" :
			driver.findElement(this.getObject(p,ObjectName,ObjectType)).getText();
			break;
			
		case "SETTEXT" :
			driver.findElement(this.getObject(p,ObjectName,ObjectType)).sendKeys(p.getProperty(value));
			break;	
		
		case "GOTOURL" :
			driver.get(p.getProperty(value));
			break;	
		case "VERIFYTITLE" :
			String actualTitle = driver.getTitle();
			//Verify.verify(actualTitle.equals(p.getProperty(ObjectName)));
			//System.out.println("Actual title is : "+ actualTitle);
			if(actualTitle.equals(p.getProperty(ObjectName).toString()))
			{
				System.out.println(ObjectName + " is verified");
			}
			else
			{
				System.out.println(ObjectName + " is wrong");
			}
		default :
			break;
		}
	}
	
	/* Find elements by object type and name */
	private By getObject(Properties p,String ObjectName, String ObjectType )throws Exception
	{
		if (ObjectType.equalsIgnoreCase("NAME"))
		{
			return By.name(p.getProperty(ObjectName));
			
		}
		else if(ObjectType.equalsIgnoreCase("ID"))
		{
			return By.id(p.getProperty(ObjectName));
			
		}
		else if(ObjectType.equalsIgnoreCase("CLASSNAME"))
		{
			return By.className(p.getProperty(ObjectName));
			
		} 
		else if(ObjectType.equalsIgnoreCase("CSS"))
		{
			return By.cssSelector(p.getProperty(ObjectName));
			
		}  
		else if(ObjectType.equalsIgnoreCase("LINKTEXT"))
		{
			return By.linkText(p.getProperty(ObjectName));
			
		}  
		else if(ObjectType.equalsIgnoreCase("PARTIALLINKTEXT"))
		{
			return By.partialLinkText(p.getProperty(ObjectName));
			
		} 
		else if(ObjectType.equalsIgnoreCase("XPATH"))
		{
			return By.xpath(p.getProperty(ObjectName));
			
		}  
		else
			throw new Exception("Wrong object type");
		
	}
}
