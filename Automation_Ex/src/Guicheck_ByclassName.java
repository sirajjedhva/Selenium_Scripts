import org.openqa.selenium.chrome.ChromeDriver;




public class Guicheck_ByclassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*String path=System.getProperty("User.dir");
     System.setProperty("webdriver.chrome.driver", path+"/Chrome/chromedriver");*/
	String path=System.getProperty("user.dir");
		//System.out.println();
    System.setProperty("webdriver.chrome.driver",path+"/Chrome/chromedriver"); 
	String tagName="";
     ChromeDriver driver=new ChromeDriver();
     driver.get("http://mail.yahoo.com");
     tagName=driver.findElementByClassName("mbr-desktop  ").getTagName();
     System.out.println(tagName);
     driver.close();
	}

}
//not done