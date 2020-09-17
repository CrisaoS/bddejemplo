package co.com.rappi.definitions;

import co.com.rappi.steps.SimpleFormDemoStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class SimpleFormDemoDefinition {

    @Steps
    SimpleFormDemoStep simpleFormDemoStep;

    @Dado("^ingreso a la pagina (.*)$")
    public void abrirPagina(String paginaWeb){
        simpleFormDemoStep.abrirPaginaWeb(paginaWeb);
    }

    @Dado("^navegar por el formulario (.*)$")
    public void navegarMenu(String opcionesMenu){
        simpleFormDemoStep.navegarMenu(opcionesMenu);
    }

    @Cuando("^ingreso el mensaje (.*)$")
    public void ingresarMensaje(String mensaje){
        simpleFormDemoStep.ingresarMensaje(mensaje);
    }

    @Cuando("^ingreso los valores (.*) y (.*)$")
    public void ingresaValorSuma(int valor1, int valor2){
        simpleFormDemoStep.ingresarValoresSuma(valor1, valor2);
    }

    @Entonces("^se muestre en pantalla el mensaje$")
    public void validarMensaje(){
        simpleFormDemoStep.validarMensaje();
    }

    @Entonces("^Se muestra la suma de los valores en pantalla$")
    public void validarSuma(){
        simpleFormDemoStep.validarSuma();
    }


}
