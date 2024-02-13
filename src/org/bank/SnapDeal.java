package org.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/login");
		WebElement txtemail= driver.findElement(By.id("userName"));
		txtemail.sendKeys("food@gmail.com");
	
		
	}

}
