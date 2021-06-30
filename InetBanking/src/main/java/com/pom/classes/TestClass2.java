package com.pom.classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {
	
	private static final String priority = null;
	
	@BeforeClass
	 public void beforeClass()
	 {
		System.out.println("Before Class");
	 }
	
	@BeforeMethod
	 public void beforeMethod()
	 {
		System.out.println("Before Method");
	 }
	
	@Test (dependsOnMethods = {"test3"}, timeOut=2000)
	 public void test1()
	 {
		System.out.println("Test 1");
	 }
	
	@Test (enabled=false)
	 public void test2()
	 {
		System.out.println("Test 2");
	 }
	
	@Test (invocationCount=3, priority=1)
	 public void test3()
	 {
		System.out.println("Test 3");
	 }
	
	@AfterMethod
	 public void afterMethod()
	 {
		System.out.println("After Method");
	 }
	
	@AfterClass
	 public void afterClass()
	 {
		System.out.println("After Class");
	 }

}
