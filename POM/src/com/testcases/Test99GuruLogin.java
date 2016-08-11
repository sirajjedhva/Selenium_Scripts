package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Guru99HomePage;
import com.pages.Guru99Login;

public class Test99GuruLogin {
	
	WebDriver driver;
	Guru99Login objLogin;
	Guru99HomePage objHomepage;
	
	@BeforeTest
	public void setup(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
	}
	/**
	 
     * This test case will login in http://demo.guru99.com/V4/
 
     * Verify login page title as guru99 bank
 
     * Login to application
 
     * Verify the home page using Dashboard message
 
     */
	@Test
	public void est_Home_Page_Appear_Correct(){
		//Create Login Page object
		objLogin=new Guru99Login(driver);
		
		//Verify login page title
		String actualTitle=objLogin.getLoginTitle();
		Assert.assertTrue(actualTitle.toLowerCase().contains("guru99 bank"));
		
		//login to application
		objLogin.loginInGuru99("mgr123", "mgr!123");
		
		 // go the next page
		objHomepage=new Guru99HomePage(driver);
		
		  //Verify home page
	    Assert.assertTrue(objHomepage.getHomePageDashBoardUserName().toLowerCase().contains("manger id : mgr123"));
	}
	@AfterTest
	public void quit(){
		driver.close();
	}
 
}
