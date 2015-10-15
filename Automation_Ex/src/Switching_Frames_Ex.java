import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Switching_Frames_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String path=System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver",path+"/Chrome/chromedriver" );
     
    ChromeDriver driver=new ChromeDriver();
    
    driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
    driver.switchTo().frame("classFrame");
    driver.findElement(By.linkText("Deprecated")).click();
    
   // driver.close();
    
    System.exit(0);
	}

}
