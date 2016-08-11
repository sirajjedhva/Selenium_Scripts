package Website_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tudo {
	
    public static void main(String[] args){
    	String str[][] = {{"abbasali123","123456"},{"abbasali","123456"},{"ravikumar","123456"}};
    	WebDriver driver=new FirefoxDriver();
    	driver.get("http://119.160.193.114:8489/Tudo/");
	        try{
    	    for (int i = 0; i < str.length; i++){				
			if(!driver.getCurrentUrl().toLowerCase().contains("login")){
				driver.findElement(By.className("btn-login")).click();
				//Thread.sleep(3000);
			}
				driver.findElement(By.id("username")).clear();
				driver.findElement(By.id("username")).sendKeys(str[i][0]);
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("password")).sendKeys(str[i][1]);
				driver.findElement(By.className("btn-login")).click();
				//Thread.sleep(5000);
				
				
				if(driver.getCurrentUrl().toLowerCase().contains("dashboard")){
				System.out.println("Login successfully: " +str[i][0]);
				String j=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div/div[1]/strong")).getText();
				System.out.println(j);
				
				int k=Integer.parseInt(j);
				System.out.println("k :"+k);
					    for(k=k;k<15;k++)
					    {
						driver.findElement(By.id("keyword")).sendKeys("testing");
						driver.findElement(By.xpath("//input[@value='add keyword']")).click();
						System.out.println("Enter succes");
					    }
						driver.findElement(By.className("dropdown-toggle")).click();
						driver.findElement(By.xpath("//*[@id='logoutForm']/ul/li[1]/ul/li[8]/a")).click();
						System.out.println("Logout success");
				//Thread.sleep(6000);
				       }
				     else
				      {
				      System.out.println("Invalid credential: " +str[i][0]);
			          }
		           }
	        }catch(Exception e){
	        e.printStackTrace();
         	driver.close();
         }
    }
    }
