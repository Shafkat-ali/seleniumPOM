package com.demoSite.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoSite.testBase.BaseClass;
import com.demoSite.utilities.CommonMethods;

public class commonLocatorsPage extends CommonMethods{

	public commonLocatorsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);

	}
	
	
	@FindBy(id="menu-item-50")
	public WebElement myAccountTab;
	
	
	

}
