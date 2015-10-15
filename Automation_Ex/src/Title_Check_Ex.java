import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Check_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new FirefoxDriver(); 
    String url="http://yahoo.com";
    String Title="Yahoo";
    String actualTitle="";
    
    driver.get(url);
    actualTitle=driver.getTitle();
    
    if(actualTitle.contentEquals(Title)){
    	System.out.println("Test passed !");
        }
    	else{
    	System.out.println("Test Failed");	
    	}
    driver.close();
	}

}
