package com.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google_Login {

	public WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test 
	public void test1() {
		driver.navigate().to("http://www.google.com");
		System.out.println("Google page opened");
		System.out.println("The title of the page : " + driver.getTitle());
	}
	
	@Test
	public void test2()
	{
		driver.navigate().to("http://facebook.com");
		System.out.println("Facebook page is opened");
		System.out.println("The Title of the page : " + driver.getTitle());

	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}