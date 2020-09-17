package co.com.rappi.definitions;

import co.com.rappi.steps.CheckboxDemoStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CheckboxDemoDefinition {

  @Steps
  CheckboxDemoStep checkboxDemoStep;

  @Cuando("^marco el checkbox$")
  public void marcarCheckbox() {
    checkboxDemoStep.marcarCheckbox();
  }

  @Entonces("^valido el mensaje en pantalla (.*)$")
  public void validarMensajeCheckbox(String mensajeEsperado) {
    checkboxDemoStep.validarCheckboxMarcado(mensajeEsperado);
  }
}
