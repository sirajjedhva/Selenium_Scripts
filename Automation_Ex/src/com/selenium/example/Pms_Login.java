package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pms_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		ChromeDriver driver=new ChromeDriver();*/
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://pms.inheritxserver.net/login");
		
		//driver.findElement(By.id("loginform-email")).clear();
		WebElement id=driver.findElement(By.id("loginform-email"));
		id.sendKeys("siraj@inheritx.com");
		System.out.println("Emaild id:"+id.getAttribute("value"));
		
		/*String id=driver.findElement(By.id("loginform-email")).getAttribute("value");
		System.out.println(id);*/
		//driver.findElement(By.id("loginform-password")).clear();
		WebElement pass=driver.findElement(By.id("loginform-password"));
		pass.sendKeys("inx@!123");
		System.out.println("Password : "+pass.getAttribute("value"));
		//driver.findElement(By.className("btn btn-primary")).submit();
          driver.findElement(By.xpath("//*[@id='login-form']/div[3]/button")).click(); 
          
          try{
        	  System.out.println("Wait for 5 sec");
        	  Thread.sleep(5000);
        	  driver.findElement(By.xpath("//*[@id='w1']/li[4]/a")).click();
        	  Thread.sleep(3000);
        	  driver.quit();
          }catch(InterruptedException e){
        	  e.printStackTrace();
          }
	}

}
