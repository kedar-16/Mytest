package com.mytest.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mytest.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath = "//input[@id='email']") 
	private WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPass;
	
	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-44j2oo']")
	private WebElement btnlogin;
	
	public  LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public DashBoardPage  userLogin(String uname ,String pass) throws InterruptedException
	{
		
		txtEmail.sendKeys(uname);
		txtPass.sendKeys(pass);
		btnlogin.click();
		Thread.sleep(5000);
		return new DashBoardPage();
	}
	
}
