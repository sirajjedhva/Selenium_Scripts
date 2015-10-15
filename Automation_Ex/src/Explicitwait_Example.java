//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;



	public class Explicitwait_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//WebDriver driver=new FirefoxDriver();
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 25100000);
		
		driver.manage().window().maximize();
	    
		driver.get("http://mail.yahoo.com");
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("login-username")).sendKeys("text");
		
		//driver.close();
	
	}

}
