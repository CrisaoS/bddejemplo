package co.com.rappi.steps;

import co.com.rappi.pages.SimpleEasyTestPage;
import co.com.rappi.pages.SimpleFormDemoPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.Matchers.is;

public class SimpleFormDemoStep extends ScenarioSteps {

    @Page
    SimpleFormDemoPage simpleFormDemoPage;

    @Page
    SimpleEasyTestPage simpleEasyTestPage;

    private final static  String MENSAJE = "mensaje";
    private final static  String SUMA = "Suma";

    @Step
    public void abrirPaginaWeb(String pagina){
        simpleEasyTestPage.abrirPaginaWeb(pagina);
    }

    @Step
    public void navegarMenu(String opciones){
        simpleEasyTestPage.cerrarPopUp();
        String[] menu = opciones.split("/");
        simpleEasyTestPage.seleccionarMenu(menu[0]);
        simpleEasyTestPage.seleccionarMenu(menu[1]);
    }

    @Step
    public void ingresarMensaje(String mensaje){
        simpleFormDemoPage.ingresarMensaje(mensaje);
        Serenity.setSessionVariable(MENSAJE).to(mensaje);
    }

    @Step
    public void ingresarValoresSuma(int valor1, int valor2){
        simpleFormDemoPage.ingresaValor1(valor1);
        simpleFormDemoPage.ingresaValor2(valor2);
        int suma = valor1+valor2;
        Serenity.setSessionVariable(SUMA).to(suma);
    }

    @Step
    public void validarMensaje(){
        simpleFormDemoPage.mostrarMensaje();
        String mensajeMostrado = simpleFormDemoPage.obtenerMensaje();
        String mensajeEsperado = Serenity.sessionVariableCalled(MENSAJE);
        MatcherAssert.assertThat("los mensajes no coinciden", mensajeEsperado, is(mensajeMostrado));
    }

    @Step
    public void validarSuma(){
        simpleFormDemoPage.calcularSuma();
        String sumaMostrada = simpleFormDemoPage.obtenerSuma();
        String suma = String.valueOf(Serenity.sessionVariableCalled(SUMA));
        MatcherAssert.assertThat("la suma no es la misma", sumaMostrada, is(suma));
    }
}
