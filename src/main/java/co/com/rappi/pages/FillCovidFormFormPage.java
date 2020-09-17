package co.com.rappi.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class FillCovidFormFormPage extends PageObject {

    @FindBy(xpath = ".//input[@name='data[identificacion_usuario]']")
    private WebElementFacade txtCedula;

    @FindBy(xpath = ".//input[@name='data[nombre_usuario]']")
    private WebElementFacade txtNombre;

    @FindBy(xpath = "//*[contains(@class, 'btn')]")
    private WebElementFacade btnSiguiente;

    public void ingresarCedula(int cedula){
        typeInto(txtCedula, String.valueOf(cedula));
    }
    public void ingresarNombre(String nombre){
        typeInto(txtNombre, nombre);
    }

    public void siguiente(){
        btnSiguiente.click();
    }
}
