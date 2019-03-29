package com.qa.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest {

	@Test
	public void add() {
		System.out.println("sum");
		int a = 10;
		int b= 20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("sub");
		int a = 10;
		int b= 20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void div() {
		System.out.println("div");
		int a = 10;
		int b= 20;
		Assert.assertEquals(30, b/a);
	}
	
	@Test
	public void mul() {
		System.out.println("mul");
		int a = 10;
		int b= 20;
		Assert.assertEquals(200, a*b);
	}
	
	
}
