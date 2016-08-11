import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Guru99CrossBrowserScript {
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser){
	     if(browser.equalsIgnoreCase("chrome")){
	    	String path=System.getProperty("user.dir");
	    	System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
	    	 driver=new ChromeDriver();
	     }
	     else if(browser.equalsIgnoreCase("firefox")){
	    	 driver=new FirefoxDriver();
	     }
	     else{
	    	 System.out.println("Browser is not correct");
	     }
	}
	@Test
	public void testParameterWithXML(){
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("guru99");
		driver.findElement(By.name("password")).sendKeys("guru99");
		
	}
}
