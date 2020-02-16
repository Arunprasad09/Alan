package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lvb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day2\\Driver\\chromedriver.exe");
		WebDriver v = new ChromeDriver();
		v.get("https://www.lvbankonline.in/index.html?module=login");
		WebElement a = v.findElement(By.xpath("//input[@name='username']"));
		a.sendKeys("Sachin");
			
	}

}
