import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Event {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.guru99.com/");
		
		WebElement home=driver.findElementByXPath("//*[@id='rt-feature']/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a/i");
		try{
			Thread.sleep(5000);
			System.out.println("Wait for 5 sec");
		    Actions action=new Actions(driver);
		    action.moveToElement(home).click().perform();
		    System.out.println("Successfully done");
	 }catch(Exception e)
	 {
	 System.out.println(e);	 
	 }
	 }
}
