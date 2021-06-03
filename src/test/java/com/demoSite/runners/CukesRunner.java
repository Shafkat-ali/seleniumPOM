package com.demoSite.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		 plugin = { "pretty", "html:target/default-cucumber-reports", "json:target/cucumber.json" } 
		,features = "src/test/resources/features" 
		,glue = "stepDefinitions"
		,dryRun = true 
	//	,tags = ""

)
public class CukesRunner {

}
