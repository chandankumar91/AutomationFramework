package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.runner.Base;
import com.qa.pages.loginpage;

public class loginpagetest extends Base {
	loginpage temp = new loginpage();
	public loginpagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void launch()
	{
		
		temp.driversetup();
		
	}
	
	@Test
	public void logintestfirst()
	{
		System.out.println(temp.loginpagetitle());
	}
	
	@AfterMethod
	public void Endpoint()
	{
		driver.quit();
	}
	

}
