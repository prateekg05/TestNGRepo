package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertTest {

WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationWorkSpace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
				
	}
	
	@Test
	public void TasLoginTest() {
		String text = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']")).getText();
		System.out.println(text);
		Assert.assertEquals("Create an account", text);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
