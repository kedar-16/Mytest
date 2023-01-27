package com.mytest.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static String TakeScreshot(WebDriver driver,String FileName)
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ss=(TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShots\\" + FileName + "_" + dateName + ".png";
		try {
			FileUtils.copyFile(source,new File (destination));
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		return destination;
	}

}
