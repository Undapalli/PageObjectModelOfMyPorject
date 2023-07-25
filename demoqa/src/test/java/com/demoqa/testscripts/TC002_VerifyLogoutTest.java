package com.demoqa.testscripts;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.pageobjects.LoginPageObjects;
import com.demoqa.testbase.TestBase;

public class TC002_VerifyLogoutTest extends TestBase {
	
	private static final Logger log = Logger.getLogger(TC002_VerifyLogoutTest.class);
	
	@BeforeMethod
	public void testStart() {
		selectBrowser(getValue("browser"));
		enterUrl(getValue("url"));
	}

	@AfterMethod
	public void testFinish() {
		closeBrowser();
	}
	
	@Test
	public void verifyLoginTest() {
		log.info("verifyLoginTest test is started");
		LoginPageObjects obj = new LoginPageObjects();
		obj.performLoginOperaation();
		log.info("verifyLoginTest test is Finished");
	}

}
