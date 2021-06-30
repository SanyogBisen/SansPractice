package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
    WebDriver driver;
	
	
    
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password]")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement login;
	
	
	
	
	 public LoginPage(WebDriver driver) 
	 {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void sendUserName(String data)
	{
		username.sendKeys("mngr331730");
	}
	
	public void sendPassword(String data)
	{
		password.sendKeys("qyduytj");
	}
	
	public void clickOnLogin()
	{
		login.click();
	}

}
