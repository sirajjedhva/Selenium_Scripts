package operation;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UiOperation {
	
	WebDriver driver;
	public UiOperation(WebDriver driver) {
		this.driver=driver;
	}
	public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
		System.out.println("");
		switch(operation.toUpperCase()){
		
		case "CLICK":
			//perform to click
			driver.findElement(this.getObject(p,objectName,objectType)).click();
			break;
		
			
		case "SETTEXT":
			driver.findElement(this.getObject(p, objectName, objectType)).sendKeys(value);
			break;
			
		case "GOTOURL":
			driver.get(p.getProperty(value));
			break;
			
		case "GETTEXT":
			driver.findElement(this.getObject(p, objectName, objectType)).getText();
			break;
			
		default :
		    break;	
		}
	}
	private By getObject(Properties p,String objectName,String objectType) throws Exception{
		//Find by xpath
		if(objectType.equalsIgnoreCase("XPATH")){
			
			return By.xpath(p.getProperty(objectName));
		}
		//find by class
		else if(objectType.equalsIgnoreCase("CLASSNAME")){
			
			return By.className(p.getProperty(objectName));
			
		}
		//find by name
		else if(objectType.equalsIgnoreCase("NAME")){
			
			return By.name(p.getProperty(objectName));
			
		}
		//Find by css
		else if(objectType.equalsIgnoreCase("CSS")){
			
			return By.cssSelector(p.getProperty(objectName));
			
		}
		//find by link
		else if(objectType.equalsIgnoreCase("LINK")){
			
			return By.linkText(p.getProperty(objectName));
			
		}
		//find by partial link
		else if(objectType.equalsIgnoreCase("PARTIALLINK")){
			
			return By.partialLinkText(p.getProperty(objectName));
			
		}else
		{
			throw new Exception("Wrong object type");
		}
	}
	}
