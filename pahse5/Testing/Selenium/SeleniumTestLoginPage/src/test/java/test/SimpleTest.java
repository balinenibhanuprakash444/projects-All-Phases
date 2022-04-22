package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
public class SimpleTest {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\files\\Phase 5\\Testing\\mschromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("C:\\bhanu\\files\\pahse5\\Testing\\index.html");
	  }	
	
@Test
public void testTitle() {
	  String title = driver.getTitle();
	  assertEquals(title,"My App");
}

@Test
public void testH1Value() {
	  WebElement ele1 	= driver.findElement(By.tagName("h1"));
	  assertEquals(ele1.getText(),"Welcome to Simple Selenium Testing");
}


@AfterTest
public void afterTest() {
	  driver.quit();
}
}
