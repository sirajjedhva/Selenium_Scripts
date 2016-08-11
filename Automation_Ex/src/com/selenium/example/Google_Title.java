package com.selenium.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		String title="Google";
        String Actaultitle="";		
		driver.get("https://www.google.com");
		Actaultitle=driver.getTitle();
		System.out.println("Title of page is : "+Actaultitle);
		
		if(Actaultitle.equals(title)){
			System.out.println("Title is matched");
		}else{
			System.out.println("Title does not matched");
		}
        driver.quit();
	}

}
