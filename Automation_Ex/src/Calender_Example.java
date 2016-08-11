import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calender_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium");
		WebElement dateBox=driver.findElement(By.xpath("/html/body/form/input[1]"));
		dateBox.sendKeys("01012016");
		dateBox.getAttribute("value");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0250PM");
		driver.findElement(By.xpath("/html/body/form/input[2]")).submit();
		WebElement date=driver.findElement(By.tagName("body"));
		
		System.out.println(date.getText());
		
	}

}
