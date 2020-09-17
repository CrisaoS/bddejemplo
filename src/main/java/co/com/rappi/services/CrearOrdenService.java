package co.com.rappi.services;

import co.com.rappi.models.orden.Orden;
import io.restassured.http.ContentType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.aspectj.weaver.ast.Or;

public class CrearOrdenService extends ScenarioSteps {

  private static final String URL = "http://v2.dev.rappi.com/api/orders/split";
  private static final String CUERPO_ORDEN = "{\n"
      + "  \"address\": {\n"
      + "    \"address\": \"We Work 93\",\n"
      + "    \"city\": {\n"
      + "      \"city\": \"Bogotá\",\n"
      + "      \"description\": \"Ingresa tu dirección \",\n"
      + "      \"id\": 1,\n"
      + "      \"lat\": 4.676777,\n"
      + "      \"lng\": -74.056748\n"
      + "    },\n"
      + "    \"country\": \"CO\",\n"
      + "    \"lastorder\": 755378040,\n"
      + "    \"description\": \"Piso 6 Interior 6-2\",\n"
      + "    \"id\": 112022479,\n"
      + "    \"active\": true,\n"
      + "    \"lat\": 4.678945956794,\n"
      + "    \"lng\": -74.055533073843,\n"
      + "    \"count_orders\": 0,\n"
      + "    \"tag\": \"Otro\",\n"
      + "    \"zone\": {\n"
      + "      \"id\": \"1\",\n"
      + "      \"name\": \"Bogotá - Chico - zones\",\n"
      + "      \"zone_type\": \"\"\n"
      + "    }\n"
      + "  },\n"
      + "  \"appsflyer_id\": \"1558653811078-7440768024219959958\",\n"
      + "  \"comment\": \" \",\n"
      + "  \"declared_value\": 0.0,\n"
      + "  \"delivery_method\": \"\",\n"
      + "  \"payment\": {\n"
      + "    \"name\": \"cash\",\n"
      + "    \"cc_type\": \"\"\n"
      + "  },\n"
      + "  \"place_at\": \"\",\n"
      + "  \"products\": [\n"
      + "    {\n"
      + "      \"comments\": \" \",\n"
      + "      \"id\": \"6660563_173738\",\n"
      + "      \"sale_type\": \"U\",\n"
      + "      \"toppings\": [\n"
      + "\n"
      + "      ],\n"
      + "      \"units\": 1\n"
      + "    },\n"
      + "    {\n"
      + "      \"comments\": \" \",\n"
      + "      \"id\": \"6660563_42606\",\n"
      + "      \"sale_type\": \"U\",\n"
      + "      \"toppings\": [\n"
      + "\n"
      + "      ],\n"
      + "      \"units\": 1\n"
      + "    }\n"
      + "  ],\n"
      + "  \"tip\": 0.0,\n"
      + "  \"use_rappi_credit\": false,\n"
      + "  \"use_rappi_pay_credit\": false\n"
      + "}";


  @Step
  public int crearOrden(String token) {
    SerenityRest.given().log().all().auth().oauth2(token).contentType(ContentType.JSON)
        .body(CUERPO_ORDEN).when().post(URL).then().log().all().statusCode(200);
    Orden orden = SerenityRest.lastResponse().jsonPath().getList(".", Orden.class).get(0);
    return orden.getId();
  }

}
