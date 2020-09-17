package co.com.rappi.definitions;

import co.com.rappi.steps.MenuSeleniumEasyStep;
import io.cucumber.java.es.Dado;
import net.thucydides.core.annotations.Steps;

public class SeleniumEasyDefinition {

  @Steps
  MenuSeleniumEasyStep menuSeleniumEasyStep;

  @Dado("^que ingreso a la pagina Selenium Easy y navego hasta el formualario (.*)/(.*)$")
  public void ingresarPaginaMenu(String opcionMenuPpal, String opcionMenuSecundario) {
    menuSeleniumEasyStep.navegarMenuStep(opcionMenuPpal, opcionMenuSecundario);
  }
}
