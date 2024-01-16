package com.restful.booker.testsuite;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserGetBookingTest extends TestBase {

    @Test
    public void getAllBookingIdSuccessfully() {
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleBookingIdSuccessfully() {
        Response response = given()
                .pathParam("id", 2471)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
