package co.com.rappi.definitions;

import co.com.rappi.steps.FillCovidFormStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class FillCovidFormDefinition {

    @Steps
    FillCovidFormStep fillCovidFormStep;

    @Dado("^ingreso con la pagina web (.*)$")
    public void ingresoPagina(String pagina){
        fillCovidFormStep.abrirPagina(pagina);
    }

    @Dado("^le doy click en Sí, autorizo$")
    public void autorizarDatos(){
        fillCovidFormStep.autorizarDatos();
    }

    @Cuando("^ingreso mi cedula (.*) y nombre (.*)$")
    public void ingresoDatos(int cedula, String nombre){
        fillCovidFormStep.ingresarDatos(cedula, nombre);
    }

    @Cuando("^le doy en Finalizar$")
    public void finalizarForm(){
        fillCovidFormStep.finalizarForm();
    }

    @Entonces("^se valida el mensaje en pantalla (.*)$")
    public void validarMensaje(String mensaje){
        fillCovidFormStep.validaMensaje(mensaje);
    }
}
