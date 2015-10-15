import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Title_Check_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new FirefoxDriver();
    String title="Google";
    String actualTitle="";
    
    driver.get("http://www.google.com");
    actualTitle=driver.getTitle();
    
    if(actualTitle.contentEquals(title)){
    	System.out.println("Test passed ");
    }
    else{
    	System.out.println("Test Failed !");
    }
    driver.close();
	System.exit(0);//terminate entire program
	}

}