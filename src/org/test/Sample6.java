package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day2\\Driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.irctc.co.in/");
		WebElement use = a.findElement(By.id("userId"));
		use.sendKeys("8763");
		   WebElement pwd = a.findElement(By.id("pwd"));
		   pwd.sendKeys("123");
		   a.quit();
		
	}

}
