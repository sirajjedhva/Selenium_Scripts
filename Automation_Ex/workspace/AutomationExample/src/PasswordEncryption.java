
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PasswordEncryption {
   
	//String encryptPassword;
	
	
	public static void main(String[] args) throws Exception {
		
	String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		
         WebDriver driver=new ChromeDriver();
		
		/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);

		WebDriver driver1 = new RemoteWebDriver(capabilities);*/
         
		driver.get("http://upitchnew.inheritxserver.net/pitch");
		
	    driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/form/a")).click();;
	    WebElement pwd1=driver.findElement(By.id("UserEmail"));
	    pwd1.sendKeys("newpitch@inx.com");
	    WebElement pwd=driver.findElement(By.id("UserPassword"));
        byte[] encodedBytes = Base64.encodeBase64("Password".getBytes());
        System.out.println("encodedBytes "+ new String(encodedBytes));
        byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
        System.out.println("decodedBytes "+ new String(decodedBytes));
        pwd.sendKeys(new String(encodedBytes));
       
       driver.findElement(By.xpath("//*[@id='UserLoginForm']/div[5]/div/input")).click();
	}
}
