package co.com.rappi.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/fill_covid_form.feature",
        glue = {"co.com.rappi.definitions"})

public class FillCovidFormRunner {
}
