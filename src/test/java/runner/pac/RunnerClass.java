package runner.pac;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\PRAKASH\\Project\\AdactinCucumber\\src\\test\\java\\feature\\Adactin.feature",glue = "step.defi",publish = true,
plugin = {
        "pretty",
        "json:target/cucumber-reports/Cucumber.json",
        "html:target/cucumber-reports.html"
},monochrome = true)
public class RunnerClass {

}
