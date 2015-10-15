import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AccessingForms_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("http://soccer.inheritxserver.net/site/login");
    driver.findElement(By.name("LoginForm[username]")).sendKeys("siraj@inheritx.com");
    driver.findElement(By.name("LoginForm[password]")).sendKeys("123456");
    //driver.findElement(By.id("loginform-username")).clear();
    driver.findElement(By.id("loginform-rememberme")).click();
    //driver.findElement(By.name("login-button")).submit();
	}

}
