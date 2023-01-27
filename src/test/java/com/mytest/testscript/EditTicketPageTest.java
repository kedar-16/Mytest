package com.mytest.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mytest.base.BaseClass;
import com.mytest.pageobject.DashBoardPage;
import com.mytest.pageobject.EditTicketPage;
import com.mytest.pageobject.HomePage;
import com.mytest.pageobject.LoginPage;
import com.mytest.pageobject.OPenTicketPage;
import com.mytest.utility.Log;

public class EditTicketPageTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	DashBoardPage dp;
	EditTicketPage ep;
	
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

		@Test
		public void editTickePopupTest() throws InterruptedException
		{
			hp=new HomePage() ;
			lp= new LoginPage() ;
			dp=new DashBoardPage() ;
			Log.startTestCase("Edit Ticket Test Start");
			ep=new EditTicketPage();
			hp.clickOnUserLogin();
			dp=lp.userLogin(prop.getProperty("username"),prop.getProperty("password"));
			ep.updateTicket();
			ep.commentsSend();
			String actualstatus = ep.getStatusofTicket();
			String expectedstatus="Closed";
			Assert.assertEquals(actualstatus, expectedstatus,"Update Ticket Successfully");
			Log.startTestCase("Edit Ticket Test Start");
		}
		
		

}
