package com.pom.classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass3 {
	
	@BeforeSuite
	 public void beforeSuite()
	 {
		System.out.println("Before Suite TestClass3");
	 }
	
	@BeforeClass
	 public void beforeClass()
	 {
		System.out.println("Before Class TestClass3");
	 }
	
	@BeforeMethod
	 public void beforeMethod()
	 {
		System.out.println("Before Method TestClass3");
	 }
	
	@Test (dependsOnMethods = {"test3"}, timeOut=2000)
	 public void test1()
	 {
		System.out.println("Test 1 TestClass3");
	 }
	
	@Test (enabled=false)
	 public void test2()
	 {
		System.out.println("Test 2 TestClass3");
	 }
	
	@Test (invocationCount=3, priority=1)
	 public void test3()
	 {
		System.out.println("Test 3 TestClass3");
	 }
	
	@AfterMethod
	 public void afterMethod()
	 {
		System.out.println("After Method TestClass3");
	 }
	
	@AfterClass
	 public void afterClass()
	 {
		System.out.println("After Class TestClass3");
	 }
	
	@AfterSuite
	 public void afterSuite()
	 {
		System.out.println("After Suite TestClass3");
	 }

}
