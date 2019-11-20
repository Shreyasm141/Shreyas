package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue= {"smoke.feature"},plugin=("html:target/cucumber.html"),tags=(" @Functionaltest"))

public class TestRunner {

}
