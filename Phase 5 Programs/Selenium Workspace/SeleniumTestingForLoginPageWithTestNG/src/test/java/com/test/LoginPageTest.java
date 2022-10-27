package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginPageTest {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Desktop\\Java FSD Phase 5 - MindWeaver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	 }	
	
  
  @Test
  public void loginPageTest() {
	  driver.get("http://127.0.0.1:5500/login.html");
	  String title = driver.getTitle();
	  assertEquals(title, "Document");
	  driver.manage().window().maximize();
	  WebElement emailIdRef = driver.findElement(By.id("eid"));			// reference of email field
	  WebElement passwordRef = driver.findElement(By.id("pid"));		// refernce of password field 
	  WebElement submitButton = driver.findElement(By.name("b1"));		// submit button reference 
	  WebElement resetButton = driver.findElement(By.name("b2"));		// reset button reference 
	  //1st option we click without writing email id and password 
//	  submitButton.click();
//	  Alert alert = driver.switchTo().alert();				// we will get the alert box reference 
//	  String result1 = alert.getText();						// get the value from alert box 
//	  assertEquals(result1, "Email Id is required");
	  
//	  //2nd option we click after written email id 
//	  emailIdRef.sendKeys("ajay@gmail.com");
//	  submitButton.click();
//	  Alert alert = driver.switchTo().alert();
//	  String result1 = alert.getText();	
//	  assertEquals(result1, "Password is required");
	  
	//3rd option we click after written email id and password  
//	  emailIdRef.sendKeys("ajay@gmail.com");
//	  passwordRef.sendKeys("123");
//	  submitButton.click();
//	  Alert alert = driver.switchTo().alert();
//	  String result1 = alert.getText();	
//	  assertEquals(result1, "failure try once again");
	  
	  //4th option we click after written email id and password  
	  emailIdRef.sendKeys("raj@gmail.com");
	  passwordRef.sendKeys("123");
	  submitButton.click();
	  Alert alert = driver.switchTo().alert();
	  String result1 = alert.getText();	
	  assertEquals(result1, "successfully login");
	  alert.dismiss();
	  String targetPage = driver.getCurrentUrl();
	  System.out.println(targetPage);
	  WebElement h2TargetPageTag = driver.findElement(By.tagName("h2"));
	  assertEquals(h2TargetPageTag.getText(), "Welcome to Home Page");
  }
  @AfterMethod
  public void afterMethod() {
  
  }

}
