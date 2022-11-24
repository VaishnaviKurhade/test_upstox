package CucumberStepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/// for report genrating we used runner class
//reports=HTML/JSON/JUNIT/XML
@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Velocity\\Automation\\2JulyABatchmaven-20221116T110949Z-001\\2JulyABatchmaven\\CucumberFeature", glue = {
		"CucumberStepDefination" }, monochrome = true, plugin = { "json", "html:target/HtmlReports.html" })
public class TestRunner {

}
