import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckBox_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("nilaminx@yahoo.in");
		driver.findElement(By.id("pass")).sendKeys("inx@123");
		
		driver.findElement(By.id("u_0_v")).click();
		
		System.out.println("Clicked login");
	
		try{
			boolean is_avail=driver.findElement(By.id("userNavigationLabel")).isDisplayed();
			System.out.println("element diaplayed?=>"+is_avail);
			Thread.sleep(1000);
			
			driver.findElement(By.id("userNavigationLabel")).click();
			System.out.println("Clicked Dropdown");
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		try{
			//boolean is_avail=driver.findElement(By.className("_w0d")).isDisplayed();
			//System.out.println("element displayed?=>"+is_avail);
//			Thread.sleep(2000);	
//			
//			driver.findElement(By.name("Log Out")).click();
//			System.out.println("Logout");	
			boolean is_avail=driver.findElement(By.className("_w0d")).isDisplayed();
			System.out.println("element:" +is_avail);
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		  
		//*[@id="u_o_3"]/div/div/div[1]/div/div/ul/li[16]/a/span/span
		//*[@id="u_c_3"]/div/div/div[1]/div/div/ul/li[16]/a/span/span
	}

}
