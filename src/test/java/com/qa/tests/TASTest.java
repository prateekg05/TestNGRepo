package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TASTest {

	
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
	
	@Test(priority=1 ,groups="login text")
	public void TasLoginTest() {
		String text = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']")).getText();
		System.out.println(text);
	}
	
	@Test(priority=2,groups="button text",dependsOnMethods="facebooklogin")
	public void checkLoginButton() {
	 driver.findElement(By.xpath("//input[@type='submit']"));
	
	}
	
	@Test(priority=3,groups="login")
	public void facebooklogin() {
		driver.findElement(By.xpath("//*[@name = 'email']")).sendKeys("gargprateek.05@gmail.com");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("05Feb1992");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		int i = 10/0;
	}
	
	@Test(groups="test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups="test")
	public void test2() {
		System.out.println("test2");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
