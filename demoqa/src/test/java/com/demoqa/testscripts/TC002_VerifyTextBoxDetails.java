package com.demoqa.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.pageobjects.TextBoxPage_Locators;
import com.demoqa.testbase.TestBase;

public class TC002_VerifyTextBoxDetails extends TestBase {

	@BeforeMethod
	public void startTest() {
		selectBrowser("chrome");
		//EnterUrl("https://demoqa.com/text-box");
	}

	@AfterMethod
	public void finishTest() {
		closeBrowser();
	}

	@Test
	public void fillTextBOXDetails() throws InterruptedException {
		System.out.println("Verification of testcases of textbox started");
		TextBoxPage_Locators obj1 = new TextBoxPage_Locators();
       obj1.fillTextBoxForm();
       Thread.sleep(5000);

	}
}

