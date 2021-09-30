package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {

	WebDriver driver;
	Actions action;

	// Navigate to labcorp

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.labcorp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// accept cookies on homepage
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

	}

	@AfterMethod
	public void afterMethod() {
//		
//		driver.close();
	}

	// 2. Find and click Careers link

	@Test
	public void findCareer() throws InterruptedException {

		action = new Actions(driver);

		WebElement CareersLink = driver
				.findElement(By.xpath("//*[@id=\"topofpage\"]/div/footer/div[1]/div/div[1]/div/nav[1]/ul/li[3]/a"));

		Thread.sleep(3000);

		CareersLink.click();

		// scroll down

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		// accept button for cookies

		Thread.sleep(3000);

		List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));

		Boolean myButtonExist = false;
		
		for (int i = 0; i < iframes.size(); i++) {

			Thread.sleep(3000);

			driver.switchTo().frame(iframes.get(i));

			List<WebElement> listOfButtons = driver.findElements(By.xpath("//button"));

			for (int j = 0; j < listOfButtons.size(); j++) {

				if (listOfButtons.get(j).getText().toLowerCase().contains("accept")) {
					myButtonExist = true;
					listOfButtons.get(j).click();
					driver.switchTo().defaultContent();
				}
			}

			driver.switchTo().defaultContent();

		}

		
		System.out.println("This son of a bitch is finally here --- " + myButtonExist );
//		driver.switchTo().frame(element)
//		element = driver.findElement(By.xpath("(//path[@elementargument='Subs'])[1]"));
//		element.click()
//		

//		System.out.println(driver.findElement(By.tagName("iframe")).getText());
//
//		WebElement popupButton = driver.findElement(By.id("gdpr-button"));
//
//		// popupButton.click();
//
//		action.doubleClick(popupButton);

		// 3. Search for any position (that is currently active on the site) example "QA
		// Test Automation
		// Developer"

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'search-keyword')]")));
//		 Category_Body.sendKeys("AQA Test Automation Developer");

		String searchPosition = "QA Test Automation Developer";

		// WebElement searchBox =
		// driver.findElement(By.xpath("//input[contains(@id,'search-keyword')]"));
//	WebElement searchBox = driver.findElement(By.id("search-keyword-*"));

		Thread.sleep(3000);

		WebElement searchBox = driver.findElement(By.xpath("//*[@placeholder=\"Enter a Keyword to Search\"]"));
		searchBox.sendKeys(searchPosition, Keys.ENTER);

//			String searchTerm = "QA Test Automation Developer";

//			WebElement searchBox = driver.findElement(By.xpath("//input[contains(@id,'search-keyword')]"));

//			searchBox.sendKeys("QA Test Automation Developer");

		// 4. Select and browse to the position

//			WebElement position = driver.findElement(By.xpath("//*[@id=\"search-results-list\"]/ul/li[1]/a"));
//			
//			position.click();

		// 5. Add assertions to confirm
		// 1. Job Title
		// 2. Job Location
		// 3. Job Id
		// 4. Any 3 other assertions of your choice (could be text in the requirements /
		// introduction)

		// JOB TITLE
//			WebElement jobTitle = driver.findElement(By.Id(""));
//			
//			String ExpectedJobTitle = "Software Quality Assurance (QA) Engineer";
//			
//			Assert.assertEquals(ExpectedJobTitle, jobTitle.getText());
//			
//			System.out.println("Job Title is as expected – Assert passed");

//		}

	}

}
