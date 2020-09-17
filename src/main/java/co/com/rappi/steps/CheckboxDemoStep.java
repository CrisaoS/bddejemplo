package co.com.rappi.steps;


import co.com.rappi.pages.CheckboxDemoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CheckboxDemoStep extends ScenarioSteps {

  @Page
  CheckboxDemoPage checkboxDemoPage;

  @Step
  public void marcarCheckbox() {
    checkboxDemoPage.marcarCheckbox();
  }

  @Step
  public void validarCheckboxMarcado(String mensaje) {
    MatcherAssert.assertThat("El mensaje resultado no es el esperado" + mensaje,
        mensaje.equals(checkboxDemoPage.obtenerMensajeResultado()));
  }


}
