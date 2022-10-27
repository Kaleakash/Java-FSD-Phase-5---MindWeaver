package com.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.bean.Employee;

public class EmployeeServiceTest {

  @Test
  @Ignore
  public void checkUserTest() {
    //throw new RuntimeException("Test not implemented");
	  EmployeeService es = new EmployeeService();
	  boolean result1 = es.checkUser("raj", "123");
	  assertTrue(result1);
	  boolean result2 = es.checkUser("ajay", "567");
	  assertFalse(result2);
  }

  @Test
  @Ignore
  public void getEmployeeDetailsTest() {
   //throw new RuntimeException("Test not implemented");
	  EmployeeService es = new EmployeeService();
	  Employee emp = es.getEmployeeDetails();
	  assertNotNull(emp);
	  assertEquals(emp.getId(), 100);
	  assertEquals(emp.getName(), "Ravi");
	  assertEquals(emp.getSalary(), 12000);
  }

  @Test
  public void listOfEmployeeTest() {
    //throw new RuntimeException("Test not implemented");
	  EmployeeService es = new EmployeeService();
	  List<Employee> listOfEmp = es.listOfEmployee();
	  assertEquals(listOfEmp.size(), 3);
	  Employee emp = listOfEmp.get(0);
	  assertEquals(emp.getId(), 100);
	  assertEquals(emp.getName(), "Raju");
	  assertEquals(emp.getSalary(), 14000);
  }

  @Test
  public void updateSalaryTest() {
    //throw new RuntimeException("Test not implemented");
	  Employee emp = new Employee(123, "Reeta", 45000);
	  EmployeeService es = new EmployeeService();
	  float updateSalary = es.updateSalary(emp);
	  assertEquals(updateSalary, 50000);
  }
}



