import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Event2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.guru99.com/");
		WebElement Td_selenium=driver.findElement(By.linkText("SELENIUM"));
		WebElement td_link=driver.findElement(By.xpath("//*[@id='rt-feature']/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a"));
        Actions action=new Actions(driver);
        Action mouse=action.moveToElement(td_link).build();
        
       // String bg_color=td_link.getCssValue("background-color");
        String bg_color=td_link.getCssValue("");
        System.out.println("Before Background color :" +bg_color);
        mouse.perform();
        bg_color=td_link.getCssValue("background-color");
        System.out.println("After Background color :"+bg_color);
        driver.quit();
        
	}

}
