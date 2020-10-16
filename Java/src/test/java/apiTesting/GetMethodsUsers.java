package apiTesting;

import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetMethodsUsers {

    @Test(groups = {"all", "getMethods", "getAllUsers"}, description = "getAllUsers API")
    public void getAllUsers(){
        String url = "http://localhost:5000/users/all";
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get(url)
                .then()
                .extract().response();
        System.out.println(response.asString());
    }
}
