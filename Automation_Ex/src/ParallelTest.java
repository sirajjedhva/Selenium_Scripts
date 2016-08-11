import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ParallelTest {

	@Test
	public void sessionOne(){
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("nilaminx@yahoo.in");
		driver.findElement(By.id("pass")).sendKeys("inx@123");
		driver.findElement(By.id("u_0_v")).click();
	}
	@Test
	public void sessionTwo(){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
}