package com.qa.opencar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class LoginPage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	//1. private By locators
	
	private By emailId= By.id("input-email");
	private By password= By.id("input-password");
	private By loginButton= By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.partialLinkText("Forgotten Password");
	private By registerLink = By.linkText("Register");
	
	//2. page constructor
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		elementUtil = new ElementUtil(driver);
	}
	
	//3. page actions/methods/features
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String getLoginPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean isForgotPwdlinkExist() {
		return elementUtil.doIsDiplayed(forgotPwdLink);
	}
	
	public boolean isRegisterLinkExist() {
		return elementUtil.doIsDiplayed(registerLink);
	}
	
	public void doLogin(String un, String pwd) {
		elementUtil.doSendKeys(emailId, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
	}
}
