package com.demoqa.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoqa.testbase.TestBase;

public class LoginPageObjects extends TestBase{
	private static final Logger log = Logger.getLogger(LoginPageObjects.class);
	
	//Step1: Identifying Page Objects/Elements
	@FindBy(name="username")
	private WebElement txt_Username;
	
	
	@FindBy(name="password")
	private WebElement txt_Password;
	
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement btn_Login;
	
	//Step2: page Actions
	
	public void performLoginOperaation() {
		
		txt_Username.sendKeys("Admin");
		log.info("user anme is entered");
		txt_Password.sendKeys("admin123");
		log.info("user password is entered");
		btn_Login.click();
		log.info("click on login button");
	}
	

}
