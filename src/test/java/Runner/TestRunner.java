package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
        features = "C:\\Users\\kalpe\\eclipse-workspace\\BusBooking\\Features\\busticket.feature", // Location of feature file
		
		glue= {"StepDefinition"}, // The path of the step definition file
		
		monochrome = true, // display the console output in a proper readable format
		
//	    strict = true, // it will check if any step is not def in step definition file
	    
		dryRun = false, // to check the mapping is proper between feature file and step def file
		
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty"}
        
		)

public class TestRunner {

}
