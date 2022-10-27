package com.service;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestingHookMethods {

  @Test
  public void test1() {
	  System.out.println("while testing 1st method");
  }
  
  @Test
  public void test2() {
	  System.out.println("while testing 2nd method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before each method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After each method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test case");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test case");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
