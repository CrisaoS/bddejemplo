package co.com.rappi.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class SimpleFormDemoPage extends PageObject {

    @FindBy(id="user-message")
    private WebElementFacade textMessage;

    @FindBy(xpath = "//button[text()='Show Message']")
    private WebElementFacade btnmostrarMensaje;

    @FindBy(id="display")
    private WebElementFacade lblmensaje;

    @FindBy(id="sum1")
    private WebElementFacade txtValor1;

    @FindBy(id="sum2")
    private WebElementFacade txtValor2;

    @FindBy(xpath = "//button[text()='Get Total']")
    private WebElementFacade mostrarSuma;

    @FindBy(id="displayvalue")
    private WebElementFacade lblResultadoSuma;

    public void ingresarMensaje(String mensaje){
        typeInto(textMessage, mensaje);
    }

    public void mostrarMensaje(){
        btnmostrarMensaje.click();
    }

    public String obtenerMensaje(){
        return lblmensaje.getText();
    }

    public void ingresaValor1(int valor1){
        typeInto(txtValor1, String.valueOf(valor1));
    }

    public void ingresaValor2(int valor2){
        typeInto(txtValor2, String.valueOf(valor2));
    }

    public String obtenerSuma(){
        return lblResultadoSuma.getText();
    }

    public void calcularSuma(){
        mostrarSuma.click();
    }
}
