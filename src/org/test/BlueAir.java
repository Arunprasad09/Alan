package org.test;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BlueAir {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day2\\Drive\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.blueairweb.com/en/gb/");
	driver.manage().window().maximize();
	
	WebElement cookies = driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-small cookies-action close-btn set-ck']"));
	cookies.click();
	WebElement policy = driver.findElement(By.xpath("//button[@class='mfp-close']"));
	policy.click();
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	WebElement frame = driver.findElement(By.xpath("//iframe[@title='empty']"));
	
	//driver.switchTo().frame(driver.findElement(By.id("LOTCCFrame_1576577478535")));       
	//driver.findElement(By.id("apcl-close-8300")).click(); 
	//driver.switchTo().defaultContent();
	
	driver.switchTo().frame(frame);
	WebElement offer = driver.findElement(By.id("apcl-close-8300"));
	offer.click();
	WebElement Depature = driver.findElement(By.xpath("//span[@style='display: inline;']"));
	Depature.sendKeys("Denmark");
}
}
