package co.com.rappi.steps;

import co.com.rappi.pages.FillCovidFormChecklistPage;
import co.com.rappi.pages.FillCovidFormEndPage;
import co.com.rappi.pages.FillCovidFormFormPage;
import co.com.rappi.pages.FillCovidFormIntroPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.Matchers.is;

public class FillCovidFormStep extends ScenarioSteps {

    @Page
    FillCovidFormIntroPage fillCovidFormIntroPage;
    @Page
    FillCovidFormFormPage fillCovidFormFormPage;
    @Page
    FillCovidFormChecklistPage fillCovidFormChecklistPage;
    @Page
    FillCovidFormEndPage fillCovidFormEndPage;

    @Step
    public void abrirPagina(String paginaWeb){
        fillCovidFormIntroPage.abrirPagina(paginaWeb);
    }

    @Step
    public void autorizarDatos(){
        fillCovidFormIntroPage.entrar();
    }

    @Step
    public void ingresarDatos(int cedula, String nombre){
        fillCovidFormFormPage.ingresarCedula(cedula);
        fillCovidFormFormPage.ingresarNombre(nombre);
        fillCovidFormFormPage.siguiente();
    }

    @Step
    public void finalizarForm(){
        fillCovidFormChecklistPage.finalizar();
    }

    @Step
    public void validaMensaje(String mensaje){
        String mensajeMostrado = fillCovidFormEndPage.obtenerMensaje();
        MatcherAssert.assertThat("los mensajes no coinciden", mensaje, is(mensajeMostrado));
    }
}
