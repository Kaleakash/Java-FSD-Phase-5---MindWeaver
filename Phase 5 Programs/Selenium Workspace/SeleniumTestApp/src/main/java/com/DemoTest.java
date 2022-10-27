package com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Desktop\\Java FSD Phase 5 - MindWeaver\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	//WebDriver driver = new EdgeDriver();
	//WebDriver driver = new FirefoxDriver();

driver.get("file:///C:/Users/LENOVO/OneDrive/Desktop/Java%20FSD%20Phase%205%20-%20MindWeaver/Phase%205%20Programs/My%20Web%20Pages/index.html");
	
//	String pageUrl	= driver.getCurrentUrl();
//	String pageTitle = driver.getTitle();
//	String sourceCode = driver.getPageSource();
//	
//	System.out.println(pageUrl);
//	System.out.println(pageTitle);
//	System.out.println(sourceCode);

//		WebElement h2TagRef	 = driver.findElement(By.tagName("h2"));
//		WebElement pTagRef	 = driver.findElement(By.tagName("p"));
//		WebElement divTagRef	 = driver.findElement(By.tagName("div"));
//		WebElement spanTagRef	 = driver.findElement(By.tagName("span"));
//		System.out.println(h2TagRef.getTagName()+" = "+h2TagRef.getText());
//		System.out.println(pTagRef.getTagName()+" = "+pTagRef.getText());
//		System.out.println(divTagRef.getTagName()+" = "+divTagRef.getText());
//		System.out.println(spanTagRef.getTagName()+" = "+spanTagRef.getText());

		List<WebElement> allPTag  = driver.findElements(By.tagName("p"));
		Iterator<WebElement> li = allPTag.iterator();
		while(li.hasNext()) {
			WebElement we = li.next();
			System.out.println(we.getTagName()+"= "+we.getText());
		}
		driver.close();
	}

}







