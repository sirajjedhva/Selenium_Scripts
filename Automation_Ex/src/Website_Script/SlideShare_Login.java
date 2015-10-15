package Website_Script;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SlideShare_Login extends SlideShare_Credential {
	public static ChromeDriver driver;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"/Chrome/chromedriver");
		
		 driver=new ChromeDriver();
       
		driver.manage().window().maximize();
		
		driver.get("http://www.slideshare.net/");
		
		WebElement login=driver.findElementByLinkText("Login");
		login.click();
		
		try{
			System.out.println("Waiting for 5 sec");
			Thread.sleep(5000);
			WebElement user_name=driver.findElementById("user_login");
            user_name.sendKeys(username);
            System.out.println("username : " +user_name.getAttribute("value"));
            
            WebElement pass=driver.findElementById("user_password");
            pass.sendKeys(password);
            System.out.println("Password : "+pass.getAttribute("value"));
            
            driver.findElementById("login_from_loginpage").click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}