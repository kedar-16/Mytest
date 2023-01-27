package com.mytest.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mytest.base.BaseClass;

public class HomePage extends BaseClass
{
	
	@FindBy(xpath ="//button[text()='login as user']") private WebElement btnUserLogin;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnUserLogin() throws InterruptedException
	{
		btnUserLogin.click();
		Thread.sleep(3000);
		return new LoginPage();
		
	}
	

}
