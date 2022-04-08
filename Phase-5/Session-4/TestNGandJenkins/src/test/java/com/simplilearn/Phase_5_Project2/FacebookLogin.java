package com.simplilearn.Phase_5_Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	WebDriver driver;
  @Test
  public void launchFB() {
	  System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
  }
  @Test(dependsOnMethods= {"launchFB"})
  public void login() {
	  driver.findElement(By.id("email")).sendKeys("7411728178"); 
	  driver.findElement(By.id("pass")).sendKeys("aishwarya@123"); 
	  driver.findElement(By.name("login")).submit();
	  }
  
}
