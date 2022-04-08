package com.silenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest1 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		email.sendKeys("aish@gmail.com");
		pass.sendKeys("aish@123");
		
		WebElement login= driver.findElement(By.name("login"));
		login.submit();
		
	}

}
