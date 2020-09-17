package co.com.rappi.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class SimpleEasyTestPage extends PageObject {

    @FindBy(xpath = "//a[text()='No, thanks!']")
    private WebElementFacade btncerrarPopup;


    public void seleccionarMenu(String opcionMenu){
        getDriver().findElement(By.xpath("//a[contains(text(),'"+opcionMenu+"')]")).click();
    }

    public void abrirPaginaWeb(String pagina){
        getDriver().get(pagina);
    }

    public void cerrarPopUp(){
        btncerrarPopup.click();
    }
}