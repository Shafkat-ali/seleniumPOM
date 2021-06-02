package TestCases;

import java.util.concurrent.TimeUnit;



import com.demoSite.utilities.CommonMethods;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoSite.testBase.BaseClass;
import com.demoSite.utilities.ConfigsReader;
import com.demoSite.testBase.PageInitializer;

public class myAccount_Registration {
	
	
	

	@BeforeTest
	public void init() {
		BaseClass.getDriver();
		//BaseClass.getDriver().findElement(By.id("menu-item-50")).click();
		PageInitializer.commonLocPage.myAccountTab.click();

	}

	@Test
	public void registrationSignIn() {
		// register email

		PageInitializer.myAccount.emailInput.sendKeys(ConfigsReader.getProperty("newEmail"));
		// register password

		PageInitializer.myAccount.passWordInput.sendKeys(ConfigsReader.getProperty("newPassword"));
		// click register

		PageInitializer.myAccount.registerButton.click();

	}

	@Test
	public void invalidEmail() {
		// enter invalid email

		PageInitializer.myAccount.emailInput.sendKeys(ConfigsReader.getProperty("invalidEmail"));

		// new password
//	
		PageInitializer.myAccount.passWordInput.sendKeys(ConfigsReader.getProperty("newPassword"));

		// click register button
		PageInitializer.myAccount.registerButton.click();

	}

}
