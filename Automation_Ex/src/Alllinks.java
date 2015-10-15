import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alllinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"/Chrome/chromedriver");
		String underCons="underConstruction";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://inheritxdev.net/fedde");
		
		List<WebElement> linkElements=driver.findElements(By.tagName("a href"));
	    String[] linkTests=new String[linkElements.size()];
	    int i=0;
	    System.out.println("Hi");
	    
	    for(WebElement e : linkElements){
	  	
	    	//e.click();
	    	linkTests[i]=e.getText();
	    	i++;
	    
	       }
	    
	    for(String t:linkTests){
	    	driver.findElement(By.linkText("t")).click();
	    	if(driver.getTitle().equals(underCons)){
	    		
	    		System.out.println("\"" + t + "\" "+ "is under construction.");
	    	}else{
	    		
	    		System.out.println("\"" + t + "\"" + "is working."  );
	    	}
	    	driver.navigate().back();
	    }
	    driver.quit();
	}

}



 
 
 
