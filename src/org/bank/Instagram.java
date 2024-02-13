package org.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.className("_aa4b _add6 _ac4d"));
		txtusername.click();
		txtusername.sendKeys("food@gmail.com");
		
		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.sendKeys("54321");
		
		
	}

}
