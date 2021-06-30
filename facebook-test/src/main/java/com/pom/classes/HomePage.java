package com.pom.classes;

import pom.classes.FindBy;
import pom.classes.WebDriver;
import pom.classes.WebElement;

public class HomePage {
	
	@FindBy (xpath="//input[@type='search']")
	private WebElement searchBar;

	@FindBy (xpath="//]")
	private WebElement notifications;

	@FindBy (xpath="//']")
	private WebElement friends;

	public LoginPage(WebDriver, driver)
	{
	 PageFactory.initElements(driver,this);
	 }

	 public void sendDataToSearchBar() {
	  searchBar.sendKeys("sanyog");
	 }

	 public void clickOnNotifications() {
	  notifications.click();
	}

	public void clickOnFriends {
	  friends.click();
	}

	}


}
