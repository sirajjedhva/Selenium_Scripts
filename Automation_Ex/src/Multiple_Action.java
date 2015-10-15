


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action; 


public class Multiple_Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedirver");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://inheritxdev.net/workers_comp_pro/");
		driver.findElementByLinkText("Log In").click();
		WebElement username=driver.findElement(By.id("pippin_user_login"));
		
		Actions builder=new Actions(driver);
		Action seriesofaction=builder.moveToElement(username).click()
				.keyUp(username, Keys.SHIFT)
				.sendKeys(username, "siraj").keyUp(username, Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		         seriesofaction.perform();      
		         		
	}

}
