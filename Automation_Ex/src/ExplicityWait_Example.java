import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicityWait_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //WebDriver driver=new FirefoxDriver();
    String path=System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
	
	ChromeDriver driver=new ChromeDriver();
	String url="http://soccer.inheritxserver.net/site/login";
    
    driver.manage().window().maximize();
    driver.get(url);
    
    WebDriverWait wait=new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("LoginForm[username]")));
//    driver.findElement(By.name("LoginForm[username]")).sendKeys("siraj@inheritx.com");
//    driver.findElement(By.name("LoginForm[password]")).sendKeys("123456");
    //driver.findElementByXPath("//*[@id='smoothmenu1']/ul/li[3]/a");
    driver.findElementByXPath("//*[@id='loginform-username']").sendKeys("siraj@inheritx.com");
    System.out.println("username");
    //driver.findElement(By.name("LoginForm[password]")).sendKeys("123456");
  driver.findElementByXPath("//*[@id='loginform-password']").sendKeys("123456");
  
    //driver.findElement(By.name("LoginForm[username]")).clear();
    
    //driver.findElement(By.id("loginform-rememberme")).click();
    driver.findElement(By.name("LoginForm[password]")).submit();
	}

}
