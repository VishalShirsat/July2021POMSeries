package com.qa.opencar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class Registration {
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	//1. private By locators
	private By firstName = By.id("input-firstname");
	private By lastName = By.id("input-lastname");
	private By emailId= By.id("input-email");
	private By password= By.id("input-password"); 
	private By confirmPwd= By.id("input-confirm");
	private By loginButton= By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.partialLinkText("Forgotten Password");
	private By registerLink = By.linkText("Register");

}
