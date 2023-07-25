package com.demoqa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.testbase.TestBase;

public class PracticeFormPage_Locators extends TestBase{

	@FindBy(id="firstName")
	private WebElement txt_Firstname;
	
	@FindBy(id="lastName")
	private WebElement txt_Lastname;
	@FindBy(id="userEmail")
	private WebElement txt_UserEmail;
	@FindBy(xpath="//label[@for='gender-radio-1']")
	private WebElement radio_button1;
	@FindBy(id="userNumber")
	private WebElement txt_UserNumber;
	
		 
		public void FillThePractice_Form()
	
	{
		txt_Firstname.sendKeys("ram");
		txt_Lastname.sendKeys("raj");
		txt_UserEmail.sendKeys("abc@gmail.com");
		radio_button1.click();
		txt_UserNumber.sendKeys("9999394949");
	}
	
	
	
	
	
	
	
	
	
	
}
