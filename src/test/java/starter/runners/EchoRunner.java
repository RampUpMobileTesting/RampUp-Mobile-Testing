package starter.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features.app/echo.feature",
                 glue = "starter.stepdefinitions",
                 snippets = CucumberOptions.SnippetType.CAMELCASE)
public class EchoRunner {
}
