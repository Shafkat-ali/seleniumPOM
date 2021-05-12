package com.demoSite.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoSite.testBase.BaseClass;
import com.demoSite.utilities.CommonMethods;

public class myAccountPage extends CommonMethods{
	
	
	public myAccountPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
		
	}
	
	
	@FindBy(id="reg_email")
	public WebElement emailInput;
	
	@FindBy(id="reg_password")
	public WebElement passWordInput;
	
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")
	public WebElement registerButton;
	
	
	
}
