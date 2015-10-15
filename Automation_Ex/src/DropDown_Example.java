
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDown_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//WebDriver driver=new FirefoxDriver();
	
	/*String path=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");*/
		
		String path=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
	    
	    
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://inheritxdev.net/weightnot/frontend/web/index.php/site/login");
	System.out.println("Login-page");
	
	driver.findElement(By.xpath("//*[@id='login-form1']")).click();
	System.out.println("click on login page");
	//String subWindowHandler =driver.getWindowHandle() ;
	//driver.switchTo().window(subWindowHandler);
	//System.out.println("form");
	//driver.findElementByXPath("//*[@id='loginform-email']");
	try {
		System.out.println("Wait for the popup to get loaded");
		Thread.sleep(1500);
	} catch (InterruptedException e){
		throw e;
		//System.out.println("Exception : " + e.getMessage());
	}
	
	
	//driver.findElement(By.className("modal-body"));
	//System.out.println("access");
	driver.findElement(By.id("loginform-email")).sendKeys("jagdish@inheritx.com");
	driver.findElement(By.xpath("//*[@id='loginform-password']")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id='btnloginForm']")).submit();
	System.out.println("Email");
	
	}

}
