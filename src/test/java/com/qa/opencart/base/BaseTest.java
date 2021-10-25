package com.qa.opencart.base;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencar.pages.LoginPage;
import com.qa.opencart.factory.DriverFactory;

public class BaseTest {
	
	 public WebDriver driver;
	public DriverFactory df;
	public Properties prop;
     public LoginPage loginPage;
	
	@BeforeTest
	public void setUp() {
		
		df = new DriverFactory();
		prop= df.initProp();
		driver=df.initDriver(prop);
		loginPage = new LoginPage(driver);
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
