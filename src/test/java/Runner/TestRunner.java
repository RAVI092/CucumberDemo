package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature"},
glue="StepDefinition",
tags="@smoke",
dryRun = false,
plugin= {"pretty","json:Report\\cucumber-rep\\Cucumber.json","junit:Rep\\cucumber-rep\\Cucumber.xml"})

public class TestRunner {

	
	@AfterClass
public static void report_gen()
{

}
	
	
}

