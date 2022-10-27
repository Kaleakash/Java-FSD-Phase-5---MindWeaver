package com.service;

import org.testng.annotations.Test;

public class TestPriority {
  @Test(priority = 1)
  public void b() {
	  System.out.println("b test method");
  
  }
  @Test(priority = 3)
  public void a() {
	  System.out.println("a test method");
  }
  @Test(priority = 2)
  public void d() {
	  System.out.println("d test method");
  }
  @Test(priority = 4)
  public void c() {
	  System.out.println("c test method");
  }
  
  @Test(priority = 2)
  public void e() {
	  System.out.println("e test method");
  }
}
