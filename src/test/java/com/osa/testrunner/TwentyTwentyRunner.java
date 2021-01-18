package com.osa.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/com/osa/features"},
		glue= {"com.osa.steps"},
		plugin= {"pretty","html:target/TwentyTwenty.html"},
		tags="@ExampleValid"				
		//,dryRun=true
		// What I have to tell about my last project ?
	)

public class TwentyTwentyRunner {

}
