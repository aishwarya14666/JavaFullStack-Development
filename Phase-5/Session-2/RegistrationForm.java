package com.silenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/parser/");
		
		WebElement name= driver.findElement(By.id("id_name"));
        name.sendKeys("Aishwarya Chougule");
        
        WebElement email= driver.findElement(By.id("id_email"));
        email.sendKeys("geetachougule@gmail.com");
        
        WebElement number= driver.findElement(By.id("id_cell_phone"));
        number.sendKeys("7349302086");
        
        WebElement Password= driver.findElement(By.id("id_password"));
        Password.sendKeys("Aishwarya@123456789");
        
        
        WebElement checkbox=driver.findElement(By.id("id_privacy"));
       // checkbox.click();
        
       // if(checkbox.isSelected())
       // {
        //	checkbox.click();
       // }
        
        WebElement button=driver.findElement(By.id("registerButton"));
        button.click();
        
        
        
        
        
	}

}
