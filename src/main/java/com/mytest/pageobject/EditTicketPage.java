package com.mytest.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mytest.base.BaseClass;

public class EditTicketPage extends BaseClass {
Actions act=new Actions(driver);
	
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 1 css-enyo3l'])[1]")
	private WebElement btnOpenticke1;
	
	@FindBy(xpath="//p[@class='MuiTypography-root MuiTypography-body1 css-17vsqpa']")
	private WebElement btnOpenTicket2;
	
	@FindBy(xpath = "(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-tb61gt'])[6]")
	private WebElement btnChangeStatus;
	
	@FindBy(xpath="//li[@data-value='3']")
	private WebElement btnchangeStatusValue;
	
	@FindBy(xpath="(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-tb61gt'])[7]")
	private WebElement btnChangePriority;
	
	@FindBy(xpath="//li[@data-value='4']")
	private WebElement btnchangePriorityValue;
	
	@FindBy(xpath="(//span[@class='MuiTouchRipple-root css-w0pj6f'])[53]")
	private WebElement btncalender;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-tc23n8'])[17]")
	private WebElement btnDate;
	
	@FindBy(xpath="//span[@aria-label='2 hours']")
	private WebElement btnHrs;
	
	@FindBy(xpath="//span[@aria-label='05 minutes']")
	private WebElement btnMin;
	
	@FindBy(xpath="//div[@class='ant-mentions antd-textfield']")
	private WebElement txtcomments;
	
	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-to887p']")
	private WebElement btnSend;
	
	@FindBy(xpath = "(//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root  css-vq0rjw'])")
	private WebElement btnUpdate;
	
	@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular css-11rb4o0']")
	private WebElement btnSetting;
	
	@FindBy(xpath="(//div[@class='MuiBox-root css-xwmm90'])[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath="//input[@class='PrivateSwitchBase-input css-1m9pwf3']")
	private WebElement btnIncidentelemnt;
	
	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-1m9nqqg']")
	private WebElement btnUpdate2;
	
	@FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body2 css-ym6alb'])[1]")
	private WebElement getstatus;
	
	
	public EditTicketPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void updateTicket() throws InterruptedException
	{
		act.click(btnOpenticke1).build().perform();
		Thread.sleep(2000);
		act.click(btnOpenTicket2).build().perform();
		Thread.sleep(2000);
		act.moveToElement(btnChangeStatus).click(btnChangeStatus).build().perform();
		act.moveToElement(btnchangeStatusValue).click(btnchangeStatusValue).build().perform();
		Thread.sleep(2000);
		act.moveToElement(btnChangePriority).click(btnChangePriority).build().perform();
		act.moveToElement(btnchangePriorityValue).click(btnchangePriorityValue).build().perform();
		Thread.sleep(2000);
		act.moveToElement(btncalender).click(btncalender).build().perform();
		Thread.sleep(2000);
		act.moveToElement(btnDate).click(btnDate).build().perform();
		Thread.sleep(2000);
		act.moveToElement(btnHrs).click(btnHrs).build().perform();
		Thread.sleep(2000);
		act.moveToElement(btnMin).click(btnMin).build().perform();
		Thread.sleep(2000);
		act.moveToElement(btnUpdate).click(btnUpdate).build().perform();
		Thread.sleep(2000);
		
	}
	
	public void commentsSend() throws InterruptedException
	{
		txtcomments.sendKeys("test test test");
		Thread.sleep(1000);
		act.moveToElement(btnSend).click(btnSend).build().perform();
	}
	
	
	public void editSetting() throws InterruptedException
	{
		act.moveToElement(btnSetting).click(btnSetting).build().perform();
		Thread.sleep(1000);
		act.moveToElement(btnEdit).click(btnEdit).build().perform();
		Thread.sleep(1000);
		act.moveToElement(btnIncidentelemnt).click(btnIncidentelemnt).build().perform();
		Thread.sleep(1000);
		act.moveToElement(btnUpdate2).click(btnUpdate2).build().perform();
		Thread.sleep(1000);
	}
	public String getStatusofTicket()
	{
		String status = getstatus.getText();
		return status;
	}

}
