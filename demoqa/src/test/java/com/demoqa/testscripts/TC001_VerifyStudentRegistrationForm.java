package com.demoqa.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.pageobjects.PracticeFormPage_Locators;
import com.demoqa.testbase.TestBase;

public class TC001_VerifyStudentRegistrationForm extends TestBase {

	@BeforeMethod

	public void testStart() {
		selectBrowser("chrome");
		//EnterUrl("https://demoqa.com/automation-practice-form");
	}

	@Test
	public void verifyFormDeatails() {
		System.out.println("TestCases of practice form page is started");
		PracticeFormPage_Locators obj = new PracticeFormPage_Locators();
		obj.FillThePractice_Form();
		System.out.println("Testcase of practice Form Page is finished");
	}

	@AfterMethod
	public void testFinish() {
		closeBrowser();
	}
	
	
	
	
	
	
}
