package com.mytest.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.mytest.base.BaseClass;

public class ListnerClass extends ExtentReport implements ITestListener{
	public void onTestStart(ITestResult result) 
	{
		test = extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.SUCCESS) 
		{
			test.log(Status.PASS, "Pass Test case is: " + result.getName());
		}
	}
	public void onTestSkipped(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.SKIP) 
		{
			test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
		}
	}
	public void onTestFailure(ITestResult result)
	{
		try {
			test.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			String imgpath = Screenshot.TakeScreshot(BaseClass.driver, result.getName());
			
			test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgpath).build());
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
