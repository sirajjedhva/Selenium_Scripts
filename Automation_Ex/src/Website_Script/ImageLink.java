package Website_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='blueBarNAXAnchor']/div/div/div/div[1]/h1/a/i")).click();
		if(driver.getTitle().equals("Welcome to Facebook - Log In, Sign Up or Learn More ")){
			System.out.println("We are back at Facebook's homepage");
		}else{
			System.out.println("We are NOT in Facebook's homepage");
		}
	}

}
