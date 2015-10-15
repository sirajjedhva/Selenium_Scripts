import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Guicheck_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		//System.out.println();
    System.setProperty("webdriver.chrome.driver",path+"/Chrome/chromedriver"); 
    
	ChromeDriver cd=new ChromeDriver();
	cd.manage().window().maximize();
	//WebDriver cd=new FirefoxDriver();	
    String url="http://mail.yahoo.com";
    String tagName="";
    
    cd.get(url);
    tagName=cd.findElement(By.id("login-username")).getTagName();
    System.out.println(tagName);
    
    cd.close();
    System.exit(0);
	}

}
