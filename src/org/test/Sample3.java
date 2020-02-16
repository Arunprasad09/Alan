package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day2\\Driver\\chromedriver.exe");
   
	WebDriver c = new ChromeDriver();
    c.get("https://www.swiggy.com/");
    
    WebElement search = c.findElement(By.id("location"));
    search.sendKeys("Chennai");
    c.quit();
}
}

