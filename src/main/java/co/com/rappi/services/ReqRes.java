package co.com.rappi.services;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;

public class ReqRes {

  @Test
  public void whenRequestingAResourceThenLinksToResourcesMustBeReturned() {
    SerenityRest.given().log().all().when().get("https://reqres.in/api/users?page=2").then().log()
        .all().statusCode(200);
  }

}
