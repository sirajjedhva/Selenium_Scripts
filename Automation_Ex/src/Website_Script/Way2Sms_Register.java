package Website_Script;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Way2Sms_Register extends Way2Sms_Credential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String path=System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
    ChromeDriver driver=new ChromeDriver();
    /*String s=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", s+"/Chrome/chromedriver");
	ChromeDriver ff=new ChromeDriver();*/
    
    driver.manage().window().maximize();
    driver.get("http://site21.way2sms.com/jsp/UserRegistration.jsp");
    try{
    	driver.findElementByXPath("//*[@id='male']").click();
    	driver.findElementByXPath("//*[@id='name']").sendKeys(Name);
    	driver.findElementByXPath("//*[@id='dob']").sendKeys(Dob);
    	driver.findElementByXPath("//*[@id='email']").sendKeys(Email);
    	driver.findElementByXPath("//*[@id='cemail']").sendKeys(Confemail);
    	
    	Select city=new Select(driver.findElement(By.id("city")));
    	city.selectByVisibleText("Ahmedabad");
    	city.selectByValue("6");
    	driver.findElementByXPath("//*[@id='mno1']").sendKeys(Mobileno);
    	
    	//String Captcha=driver.findElementByXPath("//*[@id='capImg']").getText();
    	System.out.println("Enetr manually Captcha");
    	Thread.sleep(2000);
    	System.out.println("Sleep for 2 sec");
    	driver.findElement(By.xpath("//*[@id='terms']/b")).click();
    	System.out.println("Selected Terms");
    	
    }catch(Exception e){
    	System.out.println(e);
    }
	}
	
}
