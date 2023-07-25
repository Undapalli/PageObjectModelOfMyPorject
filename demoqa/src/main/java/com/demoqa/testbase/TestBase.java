package com.demoqa.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	private static final Logger log = Logger.getLogger(TestBase.class);
	public Properties OR = new Properties();
	
	public TestBase() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void readData() {
		try {
			File file = new File(".\\src\\main\\java\\com\\demoqa\\config\\config.properties");
			FileInputStream fis = new FileInputStream(file);
			OR.load(fis);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String getValue(String key) {
		readData();
		return OR.getProperty(key);
	}
	
	public void selectBrowser(String browser) {
		PropertyConfigurator.configure(".\\log4j.properties");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Chrome browser is selected");
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("firefox browser is selected");
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			log.info("Edge browser is selected");
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Default Chrome browser is selected");
		}
	}
	
	public void enterUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("Browser is naviagted to selected url");
	}
	
	public void closeBrowser() {
		driver.quit();
		log.info("Browser session is completed");
	}
}
