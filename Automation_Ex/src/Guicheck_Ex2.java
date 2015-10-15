import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Guicheck_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    String tagName="";
    
    driver.get("http://soccer.inheritxserver.net/site/login-page");
    tagName=driver.findElement(By.id("loginform-username")).getTagName();
    System.out.println(tagName);
    
    driver.close();
    System.exit(0);
    
	}

}
