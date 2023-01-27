package com.mytest.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mytest.base.BaseClass;
import com.mytest.pageobject.DashBoardPage;
import com.mytest.pageobject.HomePage;
import com.mytest.pageobject.LoginPage;
import com.mytest.pageobject.OPenTicketPage;
import com.mytest.utility.Log;

public class LoginPageTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	DashBoardPage dp;
	@BeforeMethod
	public void setup()
	
	{
		launchApp();
	}
@AfterMethod 
public void tearDown()
	{
		closeApp();
	}


	@Test(groups="sanity")
	public void LoginPageTest() throws InterruptedException
	{
		hp=new HomePage() ;
		lp= new LoginPage() ;
		dp=new DashBoardPage();
		hp.clickOnUserLogin();
		dp=lp.userLogin(prop.getProperty("username"),prop.getProperty("password"));
		String actualUrl=dp.getCurrUrl();
		String expectedUrl="https://dev.gogtas.com/user/dashboard";
		Assert.assertEquals(actualUrl, expectedUrl);
		Log.info("Test case Pass");
	}
}
