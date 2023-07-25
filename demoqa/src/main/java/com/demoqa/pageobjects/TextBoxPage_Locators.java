package com.demoqa.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoqa.testbase.TestBase;

public class TextBoxPage_Locators extends TestBase{
	
	@FindBy(xpath="//form//input[@id='userName']")
	private WebElement txt_Fullname;
	
	@FindBy(xpath="//div[@id='userEmail-wrapper']//input[@id='userEmail']")
	private WebElement txt_Email;
	
	@FindBy(xpath="//div[@id='currentAddress-wrapper']//textarea[@id='currentAddress']")
	private WebElement txt_Address;
	
	
	@FindBy(xpath="//div[@id='permanentAddress-wrapper']//textarea[@id='permanentAddress']")
	private WebElement txt_Paddress ;
	
public void fillTextBoxForm()
{
	txt_Fullname.sendKeys("ramya");
	txt_Email.sendKeys("abc@gmail.com");
	txt_Address.sendKeys("Hyderabad");
	txt_Paddress.sendKeys("Hyderabad",Keys.RETURN);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
