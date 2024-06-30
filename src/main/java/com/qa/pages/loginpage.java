package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.runner.Base;

public class loginpage extends Base {
	
	//Page Factory
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@class='button' and @type='submit']")
	WebElement loginbtn;
	
	// Initialization of web elements
	public loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String loginpagetitle()
	{
		return driver.getTitle();
	}
	
	public homepage login(String us, String pw)
	{
		username.sendKeys(us);
		password.sendKeys(pw);
		loginbtn.click();
		return new homepage();
		
	}
	
	
	
	

}
