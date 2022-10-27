package com.test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePage {
WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Desktop\\Java FSD Phase 5 - MindWeaver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	 }	
	
  
  @Test
  public void googlePageTest() {
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  String title = driver.getTitle();
	  assertEquals(title, "Google");
	  WebElement we1 = driver.findElement(By.name("q"));
	  we1.sendKeys("What is spring boot");
	  WebElement button = driver.findElement(By.name("btnK"));
	  button.click();
  }
  @AfterMethod
  public void afterMethod() {
  
  }
}
