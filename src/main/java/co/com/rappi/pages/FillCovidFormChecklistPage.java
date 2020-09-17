package co.com.rappi.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class FillCovidFormChecklistPage extends PageObject {

    @FindBy(xpath = "//*[contains(@class, 'btn')]")
    private WebElementFacade btnFinalizar;

    public void finalizar(){
        btnFinalizar.click();
    }
}
