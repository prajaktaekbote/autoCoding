package com.offshore.sampleProject;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;

import cucumber.api.CucumberOptions; 

public class testRunner {
	
	

	@RunWith(ExtendedCucumber.class)
	@ExtendedCucumberOptions(jsonReport = "target/cucumber.json", detailedReport = true, detailedAggregatedReport = true, overviewReport = true, jsonUsageReport = "target/cucumber-usage.json", usageReport = true, toPDF = true,		
			outputFolder = "target",
		     reportPrefix = "IBank")
	@CucumberOptions(plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json",
			"pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
			//"junit:target/cucumber-results.xml" }, features = { "D:/CompassTestAutomation/FeatureOrder_IBank" }, tags = {})
	        "junit:target/cucumber-results.xml" }, features = { "src/test/resources" }, tags = {"@globalwalletcard_checkEntryPoints_ActivateCardLink_From_Dashboard","@smoke"})
			//features = { "C:\\Users\\COMPASS03\\temp\\CompassTestAutomation\\FeatureOrder_IBank" }
	public class IBankTestSuite {
	} 


}
