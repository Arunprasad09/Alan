package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day2\\Driver\\chromedriver.exe");
         
		WebDriver a = new ChromeDriver();
         a.get("https://www.snapdeal.com/login");
         
         WebElement login = a.findElement(By.id("userName"));
         login.sendKeys("sachin123");
         a.quit();
	}

}
