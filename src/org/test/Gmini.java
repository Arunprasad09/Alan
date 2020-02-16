package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmini {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day2\\Drive\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://gadgetshoponline.uk/");
	driver.manage().window().maximize();
	
	WebElement ae = driver.findElement(By.xpath("(//p[@data-ux='Text'])[3]"));
	ae.click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	WebElement addcart = driver.findElement(By.id("addtocart-btn"));
	addcart.click();
	WebElement chkout = driver.findElement(By.id("checkout-btn"));
	chkout.click();
	WebElement email = driver.findElement(By.id("address_email"));
	email.sendKeys("test123@gmail.com");
	WebElement frstnme = driver.findElement(By.id("ship_address_firstname"));
	frstnme.sendKeys("John");
	WebElement lstnme = driver.findElement(By.id("ship_address_lastname"));
	lstnme.sendKeys("Mathew");
	WebElement strt = driver.findElement(By.id("ship_address_address1"));
	strt.sendKeys("Bute Street");
	WebElement zcode = driver.findElement(By.id("ship_address_zipcode"));
	zcode.sendKeys("CF10");
	WebElement city = driver.findElement(By.id("ship_address_city"));
	city.sendKeys("Cardiff");
	WebElement submit = driver.findElement(By.id("continue-to-payment-SHIPPING"));
	submit.click();
}
}
