package co.com.rappi.services;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.json.simple.JSONObject;

public class InicioSesionRappiService extends ScenarioSteps {

  private static final String URL = "http://microservices.dev.rappi.com/api/login";

  @Step
  public String iniciarSesion(String correo, String contrasena) {
    JSONObject cuerpo = new JSONObject();
    cuerpo.put("password", contrasena);
    cuerpo.put("scope", "all");
    cuerpo.put("client_secret", "o2r4syv0eyhqaSoMryiJqlEUzRDgyRlx4RPGo8NB");
    cuerpo.put("client_id", "nr7IJTVmdVekFqRFVFHJUiDBT3jIwTrAncSE4ux3");
    cuerpo.put("username", correo);
    SerenityRest.given().log().all().contentType(ContentType.JSON).body(cuerpo).when().post(URL)
        .then().log().all().statusCode(200);
    return SerenityRest.lastResponse().jsonPath().getString("access_token");
  }

}
