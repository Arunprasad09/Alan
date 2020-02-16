package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\Selenium\\\\Day2\\\\Driver\\\\chromedriver.exe");
    WebDriver c = new ChromeDriver();
    
    c.get("https://www.google.com/");
    
    WebElement search = c.findElement(By.name("q"));
    search.sendKeys("Greens Technology");
    
    c.quit();
}
}
