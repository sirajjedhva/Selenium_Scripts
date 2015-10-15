package Website_Script;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slideshare_Signup extends SlideShare_Credential{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.slideshare.net/signup");
		
		WebElement email_id=driver.findElementById("user_email");
		email_id.sendKeys(email);
		System.out.println("Email Id :" + email_id.getAttribute("value"));
		
		WebElement user_name=driver.findElementById("user_login");
		user_name.sendKeys(username);
		System.out.println("User name:" +user_name.getAttribute("value"));
		
		WebElement pass=driver.findElementById("user_password");
		pass.sendKeys(password);
		System.out.println("Password :"+pass.getAttribute("value"));
		try{
			System.out.println("Wait for 5 sec");
			Thread.sleep(5000);
			driver.findElementByXPath("//*[@id='basic_info']/div[5]/div[1]/button").submit();
			System.out.println("Successfully Register");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
