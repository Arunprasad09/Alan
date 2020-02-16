package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day2\\Driver\\chromedriver.exe");
       WebDriver b = new ChromeDriver();
       b.get("https://www.redbus.in");
       
       WebElement source = b.findElement(By.id("src"));
       source.sendKeys("Madurai");
       
       WebElement dst = b.findElement(By.id("dest"));
	   dst.sendKeys("Chennai");
	   
	   b.quit();
}
}
