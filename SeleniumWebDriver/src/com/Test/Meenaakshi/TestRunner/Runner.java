package com.Test.Meenaakshi.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/com.Test.Meenaakshi/Features/MyTest",glue={"StepDefinition"})
public class Runner {

}
