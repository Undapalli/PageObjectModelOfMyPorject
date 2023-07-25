
package com.demoqa.testscripts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterDetailsTextBox {

	public WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void fillLoginForm() throws InterruptedException {
		// driver.get("https://demoqa.com/elements");
//		   driver.findElement(By.xpath("//*[text()='Text Box']")).click();
//		   driver.findElement(By.id("userName")).sendKeys("ramya");
//		   driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
//		   driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
//		   driver.findElement(By.id("permanentAddress")).sendKeys("Hyderabad",Keys.RETURN);
//	   
//		   //driver.findElement(By.xpath("//ul//span[text()='Check Box']"));
//		   driver.findElement(By.xpath("//li//*[text()='Radio Button']")).click();
//		WebElement radio1 = driver.findElement(By.xpath("//label[@for='yesRadio']"));
//		radio1.click();

//https://demoqa.com/text-box;		

	}
}
