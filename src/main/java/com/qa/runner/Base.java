package com.qa.runner;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utility.Utilities;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public Base()
	{
		prop=new Properties();
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\Chandan\\Desktop\\EclipseWorkspace\\newframework\\src\\main\\resources\\config.properties");
			try {
				prop.load(f);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void driversetup()
	{
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Utilities.implicitTime,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}
