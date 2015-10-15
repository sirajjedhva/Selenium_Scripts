package Website_Script;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WeightNot_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver=new FirefoxDriver();
		
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://inheritxdev.net/weightnot/frontend/web/site/login");
		driver.findElement(By.xpath("//*[@id='login-form1']")).click();
		try{
			System.out.println("Wait for 5 sec");
			Thread.sleep(5000);
		    WebElement Email=driver.findElementByXPath("//*[@id='loginform-email']");
		    Email.sendKeys("jagdish@inheritx.com");
		    //String email=Email.getAttribute("value");
			System.out.println("User Name :"  + Email.getAttribute("value"));
			
			WebElement Pass=driver.findElementByXPath("//*[@id='loginform-password']");
			Pass.sendKeys("123456");
			//String pass=Pass.getAttribute("value");
			System.out.println("Password :" + Pass.getAttribute("value"));
			
			driver.findElementByXPath("//*[@id='btnloginForm']").submit();
			System.out.println("sucessfully Login");
           }catch(Exception e)
            {
	        System.out.println(e);
            }
		    driver.close(); 
      }
}