package com.osa.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/java/com/osa/features",
		glue="com.osa.steps"

		)

public class OSARunner {

}
