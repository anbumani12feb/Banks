package org.bank;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adcatin {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("food@gmail.com");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("54321");
		

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
		
	}

}
