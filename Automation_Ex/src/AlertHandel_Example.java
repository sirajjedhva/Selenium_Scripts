import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertHandel_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("body > input[value='Go!']")).click();
		String alertmsg="";
		
		alertmsg=driver.switchTo().alert().getText();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println(alertmsg);
		driver.quit();
        
		
	}

}
