package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
    WebDriver driver;
	
    
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustomer;
	
	@FindBy(xpath="//a[text()='Delete Customer']")
	WebElement deleteCustomer;
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement newAccount;
	
	@FindBy(xpath="//a[text()='Delete Account']")
	WebElement deleteAccount;
	
	@FindBy(xpath="//a[text()='Log Out']")
	WebElement logout;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnNewCustomer()
	{
		newCustomer.click();
	}
	
	public void clickOnDeleteCustomer()
	{
		deleteCustomer.click();
	}
	
	public void clickOnNewAccount()
	{
		newAccount.click();
	}
	
	public void clickOnDeleteAccount()
	{
		deleteAccount.click();
	}	
	
	public void clickOnLogout()
	{
		logout.click();
	}


}
