import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_Aut   {

	public static void main(String[] args){
		// TODO Auto-generated method stub
   WebDriver driver=new FirefoxDriver();
	
		
	String baseUrl="http://google.com";
	String expectedTitle="Google";
	String actualTitle="";
	//driver.manage().window().maximize();
	driver.get(baseUrl);   // launch Firefox and direct it to the Base URL
	
	// get the actual value of the title
	actualTitle=driver.getTitle();
	
	 if (actualTitle.contentEquals(expectedTitle)){
         System.out.println("Test Passed !");
     } else {
         System.out.println("Test Failed !");
     }
     
     //close Firefox
     driver.close();
     
     // exit the program explicitly
     System.exit(0);
		
	}
}