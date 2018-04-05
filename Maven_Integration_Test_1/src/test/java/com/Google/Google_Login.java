package com.Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	public void test1() throws InterruptedException {
		
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.navigate().to("http://www.google.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
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
