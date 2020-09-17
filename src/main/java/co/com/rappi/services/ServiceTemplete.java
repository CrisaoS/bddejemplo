package co.com.rappi.services;

import static net.serenitybdd.rest.SerenityRest.given;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ServiceTemplete extends ScenarioSteps {

  @Step
  public void getUsers(){
    given().log().all().when().get("https://reqres.in/api/users?page=2").then().statusCode(200);
  }
}
