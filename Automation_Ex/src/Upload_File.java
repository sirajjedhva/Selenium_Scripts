import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Upload_File {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String filename = "test.txt";
		File file = new File(filename);       
		String path = file.getAbsolutePath();

		driver.get("http://www.megafileupload.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.cssSelector("i.fa.fa-upload")).click();
		WebElement upload=driver.findElement(By.cssSelector("div[class=internal] i.entypo-upload"));
		 upload.sendKeys(path);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button.btn.btn-green.btn-lg")).click(); //upload button
	}

}
