package firsttestngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Slideshare_links_check {
	
	WebDriver driver= new FirefoxDriver();
	WebDriverWait myWait= new WebDriverWait(driver,1000);
	WebDriverWait myWait1= new WebDriverWait(driver,20);
	String baseurl,stopurl;
	
	
	public void launchBrowser()
		{
			baseurl="http://www.slideshare.net";
			stopurl="http://www.slideshare.net#";
			driver.get(baseurl);
			System.out.println("Firefox is launched and directed to SlideShare website");
		}
	
	
	
  @Test
  public void verifyLinks() 
  {
	  
	  List<WebElement> linkElements= driver.findElements(By.tagName("a"));
	 // myWait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));
	  String[] linkTexts= new String[linkElements.size()];
	  
	  System.out.println("\nNumber of link texts in this page are: "+ linkElements.size());
		
		int i=0;
		//myWait.until(ExpectedConditions.visibilityOfAllElements(linkElements));
		for(WebElement e : linkElements)	// extract all link texts on the webpage
		{
			linkTexts[i]=e.getText();
			System.out.println(linkTexts[i]);
			i++;
			//System.out.println("Inside webelement :" +i + "times");
			
		}
		
		for(String t : linkTexts) 			// test each link whether it is working of not
		{
			System.out.println("Inside string");
			//myWait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(t)));
			//System.out.println(t+ "is a link");
			String link_name=driver.findElement(By.linkText(t)).getText();
			System.out.println(link_name);
			//System.out.println(t);
			driver.findElement(By.linkText(t)).click();
			
			String actualLink= "";
			actualLink=driver.getCurrentUrl();
			
			if (actualLink.contentEquals(stopurl))
			{
				System.out.println(t +  " : is not working");
			}
			else
			{
				System.out.println(t +  " : is  working");
			}
				
			driver.navigate().back();
		}
	  
  




}
}