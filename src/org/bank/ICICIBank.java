package org.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIBank {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	driver.manage().window().maximize();
	WebElement txtusername= driver.findElement(By.id("DUMMY1"));
	txtusername.sendKeys("Rogan");
	
	
	
	
		
	}

}
