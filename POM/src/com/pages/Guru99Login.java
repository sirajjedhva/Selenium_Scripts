package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
     
	WebDriver driver;
	
	By username=By.name("uid");
	By password=By.name("password");
	By titletext=By.className("barone");
	By login=By.name("btnLogin");
	
	public Guru99Login(WebDriver driver){
		this.driver=driver;
	}
	//Set user name in textbox
	public void setUserName(String strUsername){
		driver.findElement(username).sendKeys(strUsername);
	}
	//Set password in password textbox
	public void setPassword(String strPassword){
		driver.findElement(password).sendKeys(strPassword);
	}
	//Click on login button
	public void clickLogin(){
		driver.findElement(login).click();
	}
	 //Get the title of Login Page
	public String getLoginTitle(){
	 return 
		driver.findElement(titletext).getText();
	}
	/**
	 
     * This POM method will be exposed in test case to login in the application
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
 
     */
	
	public void loginInGuru99(String strUsername,String strPasssword){
		//fill username
		this.setUserName(strUsername);
		//fill password
		this.setPassword(strPasssword);
		//click login button
		this.clickLogin();
	}
}
