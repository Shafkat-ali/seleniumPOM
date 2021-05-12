package com.demoSite.pages;

import org.openqa.selenium.support.PageFactory;

import com.demoSite.testBase.BaseClass;

public class shopPage {

	public shopPage() {

		PageFactory.initElements(BaseClass.getDriver(), this);

	}

}
