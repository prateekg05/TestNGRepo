package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dataProviderTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",  "E:\\AutomationWorkSpace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(" https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		
	}
	
	
	@Test
	public void EbayhalfTest(String Email,String Password) {
		
		driver.findElement(By.xpath("//*[@id = 'userid']")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Password);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
