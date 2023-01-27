package com.mytest.pageobject;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mytest.base.BaseClass;

public class DashBoardPage extends BaseClass {
	
	public static Actions act;
	public static Select sc;
	
	@FindBy(xpath="//img[@src='/static/media/add-circle.51eda7d51f6cc6683f708b65aa64ef5f.svg']")
	private WebElement  btnCreateTicket ;
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement txtTitle;
	
	@FindBy(xpath="//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
	private WebElement txtDescription;
	
	@FindBy(xpath="//a[@class='rdw-dropdown-selectedtext'][1]")
	private WebElement dropdownFont;
	
	@FindBy(xpath="(//li[@class='rdw-dropdownoption-default rdw-inline-dropdownoption'])[2]")
	private WebElement drpfontValue;
	
	@FindBy(xpath="'//ul[@class='rdw-dropdown-optionwrapper']")
	private WebElement drplistclick;
	
//	@FindBy(xpath="//li[@class='rdw-dropdownoption-default rdw-inline-dropdownoption' and @title='Bold']")
//	private WebElement drpfontValue;
	
	@FindBy(xpath="(//a[@class='rdw-dropdown-selectedtext'])[2]")
	private WebElement  drpBlockType;
	
	@FindBy(xpath="(//a[@class='rdw-dropdown-selectedtext'])[3]")
	private WebElement drpFontSize;
	
	@FindBy(xpath="(//li[@class='rdw-dropdownoption-default rdw-fontsize-option'])[3]")
	private WebElement drpFontSizeValue;
	
	@FindBy(xpath="(//li[@class='rdw-dropdownoption-default'])[8]")
	private WebElement  drpBlockTypeValue;
	
	@FindBy(xpath="//label[text()='Assignee*']")
	private WebElement drpAssignee;
	
	@FindBy(xpath="//div[text()='High']")
	private WebElement drpPriority;
	
	@FindBy(xpath="//li[@data-value='539']")
	private WebElement AssigneeName;
	
	@FindBy(xpath="//li[@data-value='4']")
	private WebElement PriorityName;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement btnCreate;
	
	@FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body1 css-9fow1l'])[2]")
	private WebElement ticketname;

	
	public DashBoardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createTicket() throws InterruptedException
	{
		btnCreateTicket.click();
		txtTitle.sendKeys("test");
		txtDescription.sendKeys("test test test test test");
		Thread.sleep(2000);
		act=new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.build().perform();
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("c");
//		act.build().perform();
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("v");
//		act.build().perform();
		act.moveToElement(dropdownFont).click(dropdownFont).build().perform();
		Thread.sleep(3000);
		act.moveToElement(drpfontValue).click(drpfontValue).build().perform();
		Thread.sleep(3000);
		act.moveToElement(drpFontSize).click(drpFontSize).build().perform();
		Thread.sleep(3000);
		act.moveToElement(drpFontSizeValue).click(drpFontSizeValue).build().perform();
		Thread.sleep(3000);
		act.moveToElement(drpBlockType).click(drpBlockType).build().perform();
		Thread.sleep(3000);
		act.moveToElement(drpBlockTypeValue).click(drpBlockTypeValue).build().perform();
		Thread.sleep(3000);
		act.moveToElement(drpAssignee).click(drpAssignee).build().perform();
		Thread.sleep(3000);
		act.click(AssigneeName).build().perform();
		//btnCreate.click();
		Thread.sleep(5000);
	
	}
	
	public String getCurrUrl()
	{
		String dashBoardPageUrl=driver.getCurrentUrl();
		return dashBoardPageUrl;
	}
	
	public String getTicketName()
	{
		String ticketName = ticketname.getText();
		return ticketName;
	}
}
