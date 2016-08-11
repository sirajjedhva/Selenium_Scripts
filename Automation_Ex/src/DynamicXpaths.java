import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicXpaths {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();  
		driver.navigate().to("http://yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='UHSearchBox']")).sendKeys("selenium");
		Thread.sleep(10000);
		
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='yui_3_12_0_1_']/ul/li[starts-with(@id,'yui_3_12_0_1_')]/a[contains(text(),'More')]"));
	//List<WebElement> list=  driver.findElements(By.xpath("//div[@id='yui_3_12_0_1_1460454396950_758']/ul/li[starts-with(@id,'yui_3_12_0_1_1460')]/a")); 
        System.out.println(list);
        int n=list.size();
		System.out.println(n);
		//list.get(n).click();*/
		
		
		Thread.sleep(1000);
		list.get(0).click();
	    System.out.println("Text"+list.get(0).getText());	
	}

}
