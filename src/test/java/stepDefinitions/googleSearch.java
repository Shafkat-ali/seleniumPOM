package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.demoSite.testBase.BaseClass;
import com.demoSite.utilities.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearch {


	@Given("user is on google site")
	public void user_is_on_google_site() {
		BaseClass.getDriver().get(ConfigsReader.getProperty("url"));

	}

	@When("user searchs for TechCircle in a search bar")
	public void user_searchs_for_tech_circle_in_a_search_bar() {
		BaseClass.getDriver().findElement
		(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
		.sendKeys("TechCircle", Keys.ENTER);
	}

	@Then("search should yield techcircle site as one of the results")
	public void search_should_yield_techcircle_site_as_one_of_the_results() {
	    BaseClass.getDriver().findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/a/div/cite")).isDisplayed();

	}

}
