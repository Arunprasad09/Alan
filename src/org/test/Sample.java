package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day2\\Driver\\chromedriver.exe");
	
	WebDriver a=new ChromeDriver();
	a.get("https://www.facebook.com/");
	
	WebElement username = a.findElement(By.id("email"));
	
	username.sendKeys("sachin123@gmail.com");
	
	WebElement pwd = a.findElement(By.id("pass"));
	
	pwd.sendKeys("sach@453");
	a.quit();
}
}
