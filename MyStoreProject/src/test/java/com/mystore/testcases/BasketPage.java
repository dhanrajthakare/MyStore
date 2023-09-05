package com.mystore.testcases;

import org.testng.annotations.Test;

public class BasketPage {
	
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test 2");
	}
}
