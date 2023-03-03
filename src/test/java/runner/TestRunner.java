package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/features"},
		glue={"stepdefinitions"},
		snippets = SnippetType.CAMELCASE
		)
@Test
public class TestRunner {

}
