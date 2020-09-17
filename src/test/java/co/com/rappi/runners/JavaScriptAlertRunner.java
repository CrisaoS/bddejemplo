package co.com.rappi.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/javascript_alerts.feature",
    glue = {"co.com.rappi.definitions"},
    snippets = SnippetType.CAMELCASE)

public class JavaScriptAlertRunner {
}
