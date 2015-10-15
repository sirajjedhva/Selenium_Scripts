import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class Implicitwait_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String path=System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
    ChromeDriver driver=new ChromeDriver();

    String title="Google";
    String actualTitle="";
    
    driver.manage().window().maximize();
    driver.get("http://www.google.com");
    
    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    actualTitle=driver.getTitle();
    
    	if(actualTitle.contentEquals(title)){
    	System.out.println("Test Passed !");
    	
    	}
    	else
    	{
    	System.out.println("Test Failed !");
    	}
    	driver.close();
	}

}
