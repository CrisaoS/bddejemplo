package co.com.rappi.steps;

import co.com.rappi.pages.SeleniumEasyPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class MenuSeleniumEasyStep extends ScenarioSteps {

  @Page
  SeleniumEasyPage seleniumEasyPage;

  @Step
  public void navegarMenuStep(String opcionMenuPrincipal, String opcionMenuSecundario) {
    seleniumEasyPage.abrirPagina();
    seleniumEasyPage.seleccionarOpcionMenu(opcionMenuPrincipal);
    seleniumEasyPage.seleccionarOpcionMenu(opcionMenuSecundario);
  }
}
