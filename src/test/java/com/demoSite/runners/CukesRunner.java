package com.demoSite.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		 plugin = { "pretty", "html:target/default-cucumber-reports", "json:target/cucumber.json" } 
		,features = "src/test/resources/features" 
		,glue = "src/test/java/stepDefinitions"
		,dryRun = false 
	//	,tags = ""

)
public class CukesRunner {

}
