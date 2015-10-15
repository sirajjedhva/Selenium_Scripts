import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Guicheck_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //WebDriver driver=new FirefoxDriver();
	String path=System.getProperty("user.dir");	
    System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
	ChromeDriver driver=new ChromeDriver();
    String tg="";
    driver.get("http://mail.yahoo.com");
    
    //driver.findElement(By.name("sign in")).click();
    tg=driver.findElement(By.id("login-username")).getTagName();
    System.out.println(tg);
    driver.close();
    System.exit(0);
    
	}

}
