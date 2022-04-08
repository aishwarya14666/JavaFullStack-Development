package com.silenium.session2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OracleRegister {
	
public static void main(String[] args) {
        
        //set the driver property
        System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
        
        WebElement email = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:email::content\"]"));
        email.sendKeys("aishwaryachougule14666@gmail.com");
        
        WebElement password = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:password::content\"]"));
        password.sendKeys("Registration@123456789");
        
        WebElement retypepassword = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:retypePassword::content\"]"));
        retypepassword.sendKeys("Registration@123456789");
        
        Select country = new Select(driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:country::content\"]")));
        country.selectByValue("IN");
        
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:firstName::content\"]"));
        firstname.sendKeys("Aishwarya");
        
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:lastName::content\"]"));
        lastname.sendKeys("Chougule");
        
        WebElement jobtitle = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:jobTitle::content\"]"));
        jobtitle.sendKeys("Associate Software Engineer");
        
        WebElement workphone = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:workPhone::content\"]"));
        workphone.sendKeys("7349302086");
        
        
        WebElement companyname = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:companyName::content\"]"));
        companyname.sendKeys("Mphasis");
        
        WebElement address = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:address1::content\"]"));
        address.sendKeys("Vadgaon,Belgaum");
        
        WebElement city = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:city::content\"]"));
        city.sendKeys("Belgaum");
        
        Select state = new Select(driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:state::content\"]")));
        state.selectByValue("16");
        
        WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:postalCode::content\"]"));
        zipcode.sendKeys("590005");
        
        WebElement link = driver.findElement(By.linkText("Create Account"));
		link.click();
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("window.open('https://login.oracle.com/mysso/signon.jsp?request_id=007')");
		
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		//switch
		driver.switchTo().window(tabs.get(1));
		
		
		 WebElement username = driver.findElement(By.xpath("//*[@id=\"sso_username\"]"));
	     username.sendKeys("aishwaryachougule14666@gmail.com");
	        
	     WebElement pass = driver.findElement(By.xpath("//*[@id=\"ssopassword\"]"));
	     pass.sendKeys("Registration@123456789");
	     
	     WebElement button= driver.findElement(By.xpath("//*[@id=\"signin_button\"]"));
	     button.submit();      
        
}
}
