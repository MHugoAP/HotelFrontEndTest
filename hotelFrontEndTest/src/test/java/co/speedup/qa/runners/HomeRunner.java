package co.speedup.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/home.feature"
        , glue = "co/speedup/qa/stepdefinition"
        , snippets = SnippetType.CAMELCASE)
public class HomeRunner {
}
