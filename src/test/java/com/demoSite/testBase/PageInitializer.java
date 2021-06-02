package com.demoSite.testBase;

import com.demoSite.pages.commonLocatorsPage;
import com.demoSite.pages.loginPage;
import com.demoSite.pages.myAccountPage;
import com.demoSite.pages.shopPage;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass {

	public static loginPage login;
	public static commonLocatorsPage commonLocPage;
	public static myAccountPage myAccount;
	public static shopPage shPage;

	public static void initialize() {

		login = new loginPage();
		commonLocPage = new commonLocatorsPage();
		myAccount = new myAccountPage();
		shPage = new shopPage();

	}

}