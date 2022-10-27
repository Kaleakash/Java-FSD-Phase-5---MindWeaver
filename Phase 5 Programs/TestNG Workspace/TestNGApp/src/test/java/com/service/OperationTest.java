package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class OperationTest {

  @Test
  public void addTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op = new Operation();
	  int result = op.add(100, 200);
	  assertEquals(result, 300);
  }
  @Test
  public void subTest() {
	  Operation op = new Operation();
	  int result = op.sub(100, 50);
	  assertEquals(result, 50);
  }
  
  @Test
  public void mulTest() {
	  Operation op = new Operation();
	  int result = op.mul(10, 5);
	  assertEquals(result, 50);
  }
  @Test
  public void divTest() {
	  Operation op = new Operation();
	  int result = op.div(100, 50);
	  assertEquals(result, 2);
  }
}



