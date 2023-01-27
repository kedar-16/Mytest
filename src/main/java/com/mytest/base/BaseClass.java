package com.mytest.base;

import java.io.FileInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.w3c.dom.DOMConfiguration;

import com.mytest.utility.ExtentReport;
import com.mytest.utility.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeSuite(groups = {"sanity","Regression"})
	public void readConfig() throws URISyntaxException
	{
		ExtentReport.setExtent();
		ConfigurationFactory.setConfigurationFactory(new XmlConfigurationFactory());
		Configurator.reconfigure(new URI("log4j2.xml"));
		try 
		{
			prop=new Properties();
		FileInputStream file=new FileInputStream("D:\\kp\\Automation\\MyTest\\config\\config.properties");
			prop.load(file);

		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
		}
	}
	public static void launchApp()
	
	
	{
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Log.info("url open");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("chrome.switches","--disable-extensions"); 
		chrome.addArguments("--disable-save-password");
		chrome.addArguments("disable-infobars");
		
	}
	
	public static void closeApp()
	{
		driver.close();
	}
	
	@AfterSuite(groups = {"sanity","Regression"})
	public void afterSuite()
	{
		ExtentReport.endReport();
	}

}
