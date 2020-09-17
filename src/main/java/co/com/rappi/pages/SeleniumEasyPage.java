package co.com.rappi.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeleniumEasyPage extends PageObject {

  @FindBy(id = "navbar-brand-centered")
  private WebElementFacade mnuBarraNavegacion;

  public void abrirPagina() {
    getDriver().get("https://www.seleniumeasy.com/test/");
  }

  public void seleccionarOpcionMenu(String opcion) {
    mnuBarraNavegacion.find(By.xpath("//a[contains(text(),'" + opcion + "')]")).click();
  }
}
