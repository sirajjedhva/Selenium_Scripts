import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoggingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver;
		 
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		
		ChromeDriver driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		//System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk17Logger");
		
		Logger log=Logger.getLogger(LoggingDemo.class);
		//Logger log=Logger.getLogger("devpinoyLogger");
		driver.get("http://healthunify.com/bmicalculator");
			//driver.get("<a href="http://healthunify.com/bmicalculator/">http://healthunify.com/bmicalculator/</a>");                                
		log.debug("opening webiste");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.debug("entering weight");
		driver.findElement(By.name("wg")).sendKeys("87");
		log.debug("selecting kilograms");
		driver.findElement(By.name("opt1")).sendKeys("kilograms");
		log.debug("selecting height in feet");
		driver.findElement(By.name("opt2")).sendKeys("5");
		log.debug("selecting height in inchs");
		driver.findElement(By.name("opt3")).sendKeys("10");
	     //driver.switchTo().alert().accept();
		log.debug("Clicking on calculate");
		driver.findElement(By.name("cc")).click();
		
		log.debug("Getting SIUnit value");
		String SIUnit=driver.findElement(By.name("si")).getAttribute("value");
		log.debug("Getting USUnit value");
		String USUnit=driver.findElement(By.name("us")).getAttribute("value");
		log.debug("Getting UKUnit value");
		String UKunit=driver.findElement(By.name("uk")).getAttribute("value");
		log.debug("Getting overall description");
		WebElement note=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/section/article/div/form/p[3]/input[2]"));
		note.click();
				//driver.findElement(By.name("desc")).getAttribute("value");
		
		System.out.println("SiUnit = "+SIUnit);
		System.out.println("USUnit = "+USUnit);
		System.out.println("UkUnit = "+UKunit);
		System.out.println("note = "+note);
		
		System.out.println("Wait for 8 sec");
		Thread.sleep(8000);
		
		driver.quit();
		
	}

}
