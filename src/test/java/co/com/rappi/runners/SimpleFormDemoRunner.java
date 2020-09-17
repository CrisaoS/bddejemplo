package co.com.rappi.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/simple_form_demo.feature",
        glue = {"co.com.rappi.definitions"})


public class SimpleFormDemoRunner {
}