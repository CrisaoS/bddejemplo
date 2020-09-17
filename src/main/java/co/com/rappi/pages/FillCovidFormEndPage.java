package co.com.rappi.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class FillCovidFormEndPage extends PageObject {

    @FindBy(xpath = "//h1")
    private WebElementFacade mensaje;

    public String obtenerMensaje(){return mensaje.getText(); }
}
