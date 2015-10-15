import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		//System.out.println();
    System.setProperty("webdriver.chrome.driver",path+"/Chrome/chromedriver");  // 
//	WebDriver driver=new ChromeDriver();
//    String url="http://google.com";
//    driver.get(url);
    ChromeDriver cd=new ChromeDriver();
    cd.manage().window().maximize();
    String Title="Google";
    String actualTitle="";
    
    cd.get("http://www.google.co.in");
    
    cd.getTitle();
    actualTitle=cd.getTitle();
        if(actualTitle.contentEquals(Title)){
    	System.out.println("Test Passed !");
        }
    	else
    	{
    	System.out.println("Test Failed ");
    	}
    
    cd.close();
	
	}

}
