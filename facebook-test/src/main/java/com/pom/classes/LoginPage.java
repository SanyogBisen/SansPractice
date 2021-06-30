package com.pom.classes;



public class LoginPage {
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement email;

	@FindBy (xpath="//input[@name='pass']]")
	private WebElement password;

	@FindBy (xpath="//button[@name='login']")
	private WebElement login;

    LoginPage(WebDriver driver)
	{
	 PageFactory.initElements(driver,this);
	 
	 }

	 public void sendEmail() {
	  boolean result = email.isEnabled();
	  if(result == true) {
	  email.sendKeys("sanyogbisen@yahoo.com");
	 }
	 else {
	  System.out.println("email is not enabled");
	 }
	}

	 public void sendPassword() {
	  password.sendKeys("Heartbreakkid");
	}

	public void clickOnLoginButton() {
	  login.click();
	}

	}


