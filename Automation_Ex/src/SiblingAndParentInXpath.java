import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SiblingAndParentInXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://guru99.com");                                //'SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
		//List<WebElement> dateBox=driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
		//List<WebElement> dateBox=driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
		 
		List<WebElement> dateBox=driver.findElements(By.xpath("//h1[contains(text(),'Tutorials Library')]/parent::div//div[//a[text()='Learn Software Testing']]/following-sibling::div[@class='row featured-boxes']")); 
		for(WebElement webelement : dateBox){
			 System.out.println(webelement.getText());
			 
			 
		 }
		 driver.quit();
	}

}
