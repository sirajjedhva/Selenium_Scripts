import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class PageScroll {
	WebDriver driver;
	String url="http://www.inheritx.com/";
			
	@BeforeClass
	 public void setUp(){
		 driver=new FirefoxDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
	 }
	
	@Test(priority=1)
	public void scrollingUpToBottom(){
		driver.navigate().to(url);
		 /*((JavascriptExecutor) driver)
         .executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
    @Test(priority=2)
	public void scrollingToElementofAPage(){
		driver.navigate().to(url);
		WebElement element=driver.findElement(By.className("item_right"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",element);
		
		//  "arguments[0].scrollIntoView();"
	}
   /* @AfterClass
    public void tearDown(){
    	driver.quit();
    }
    */
}
