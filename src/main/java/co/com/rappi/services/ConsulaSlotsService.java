package co.com.rappi.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;

public class ConsulaSlotsService extends ScenarioSteps {

  private String URL = "http://microservices.dev.rappi.com/api/cpgops-gateway-ms/orders/$/slots";

  @Step
  public void consultarSlots(int ordenId) {
    Map<String, String> cabeceras = new HashMap<>();
    cabeceras.put("API_KEY", "f}W#3L.BQtcy{7c&");
    cabeceras.put("Authorization", "test");
    SerenityRest.given().log().all().headers(cabeceras).when()
        .get(URL.replace("$", String.valueOf(ordenId))).then().log().all().statusCode(200);
  }

  @Step
  public void validarResultadoSlots(){
    List<Map<String, Object>> slots = SerenityRest.lastResponse().jsonPath().getList("time_slots");
    MatcherAssert.assertThat("El servicio consultado no devolvio resultados", slots.size()>0);
  }

}
