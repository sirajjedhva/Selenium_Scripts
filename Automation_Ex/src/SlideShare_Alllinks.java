import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SlideShare_Alllinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver;
	driver=new FirefoxDriver();
	driver.get("http://www.slideshare.net/");
	 
	Thread.sleep(5000);
	System.out.println("Wait for 5 sec");
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	String[] linkSize=new String[links.size()];
	System.out.println(linkSize);
	System.out.println(links.size());
	
	int i=0;
	for(WebElement e:links){
		linkSize[i]=e.getText();
		System.out.println(linkSize[i]);
		i++;
	}
	for(String text:linkSize){
		/*WebElement linkname=driver.findElement(By.linkText(text));
		linkname.click();*/
		String linkname=driver.findElement(By.linkText(text)).getText();
		
		
		System.out.println(linkname+" is link");
	}
	}

}
