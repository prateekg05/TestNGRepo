package com.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGBasics {
// pre-condition annotation -- start
	
	@BeforeSuite // 1
	public void Setup() {
		System.out.println("set property for chrome browser");
	}
	
	@BeforeTest // 2
	public void LaunchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeClass // 3
	public void login() {
		System.out.println("login to app");
	}
	
	
	
	@BeforeMethod // 4
	public void EnterUrl() {
		System.out.println("open site");
	}
	
	// end
	
	
	// test case --start
	@Test // 5
	public void checktitle() {
		System.out.println("get app titel");
	}
	
	//end
	
	// post - condition ---start
	@AfterMethod // 6
	public void logout() {
		System.out.println("logout from site");
	}
	
	
	@AfterClass // 7
	public void DeleteAllCookies() {
		System.out.println("delete all cookies");
	}
	
	
	@AfterTest // 8
	public void closebrowser() {
		System.out.println("close the browser");
	}
	
	
	
	
	@AfterSuite // 9
	public void GenerateReport() {
		System.out.println("Generate Report");
	}
	
	// end
}
