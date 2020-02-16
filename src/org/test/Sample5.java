package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day2\\Driver\\chromedriver.exe");
	
	WebDriver a = new ChromeDriver();
	a.get("http://www.adactin.com/HotelApp/");
	
	WebElement name = a.findElement(By.id("username"));
	name.sendKeys("sachin123");
	
	WebElement pwd = a.findElement(By.id("password"));
	pwd.sendKeys("5678hyr");
	
	a.quit();
	
}
}
