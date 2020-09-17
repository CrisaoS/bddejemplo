package co.com.rappi.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckboxDemoPage extends PageObject {

  @FindBy(id = "isAgeSelected")
  private WebElementFacade chkSingleCheckbox;

  @FindBy(id = "txtAge")
  private WebElementFacade lblMensajeResultado;

  public void marcarCheckbox() {
    chkSingleCheckbox.click();
  }

  public String obtenerMensajeResultado() {
    return lblMensajeResultado.getText();
  }
}
