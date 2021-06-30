package com.pom.classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public HomePage homePage;
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csp\\Documents\\software testing study material\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		
	}


    
     @BeforeMethod
       public void beforeMethod()
       {
    	 LoginPage loginPage = new LoginPage(driver);
    	 loginPage.sendUserName("mngr331730");
    	 loginPage.sendPassword("qydutyj");
    	 loginPage.clickOnLogin();
        
	    }
     
     @Test
     public void verifyNewCustomerLink()
     {
    	 System.out.println("verify new customer link");
    	 homePage = new HomePage(driver);
    	 homePage.clickOnNewCustomer();
    	 String url = driver.getCurrentUrl();
    	 
    	 if(url.equals("https://demo.guru99.com/v4/manager/addcustomerpage.php"))
    	 {
    		 System.out.println("PASS");
    	 }
    	 else {
    		 System.out.println("FAIL");
    	 }
     }
     
     @Test
     public void verifyDeleteCustomerLink()
     {
    	 System.out.println("verify delete customer link");
    	 homePage = new HomePage(driver);
    	 homePage.clickOnDeleteCustomer();
    	 String url = driver.getCurrentUrl();
    	 
    	 if(url.equals("https://demo.guru99.com/v4/manager/DeleteCustomerInput.php"))
    	 {
    		 System.out.println("PASS");
    	 }
    	 else {
    		 System.out.println("FAIL");
    	 }
     }

     
     @Test
     public void verifyNewAccountLink()
     {
    	 System.out.println("verify new account link");
    	 homePage = new HomePage(driver);
    	 homePage.clickOnNewAccount();
    	 String url = driver.getCurrentUrl();
    	 
    	 if(url.equals("https://demo.guru99.com/v4/manager/addAccount.php"))
    	 {
    		 System.out.println("PASS");
    	 }
    	 else {
    		 System.out.println("FAIL");
    	 }
     }
     
     
     @Test
     public void verifyDeleteAccountLink()
     {
    	 System.out.println("verify delete account link");
    	 homePage = new HomePage(driver);
    	 homePage.clickOnDeleteAccount();
    	 String url = driver.getCurrentUrl();
    	 
    	 if(url.equals("https://demo.guru99.com/v4/manager/deleteAccountInput.php"))
    	 {
    		 System.out.println("PASS");
    	 }
    	 else {
    		 System.out.println("FAIL");
    	 }
     }
     @AfterMethod
     public void afterMethod() throws InterruptedException
     {

    	 homePage.clickOnLogout();
    	 Thread.sleep(3000);
     }
     
     @AfterClass
     public void afterClass()
     {
    	 driver.close();
     }

}
