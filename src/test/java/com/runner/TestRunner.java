package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\sampleFeatures\\pd.feature",glue ="com.stepdefns",
dryRun=false)

public class TestRunner {
	
	
	

}
