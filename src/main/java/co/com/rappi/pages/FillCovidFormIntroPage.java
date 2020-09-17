package co.com.rappi.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FillCovidFormIntroPage extends PageObject {

    @FindBy(xpath = "//button")
    private WebElementFacade btnSiAutorizo;

    public void abrirPagina(String paginaWeb){
        getDriver().get(paginaWeb);
    }

    public void entrar(){
        btnSiAutorizo.click();
    }
}
