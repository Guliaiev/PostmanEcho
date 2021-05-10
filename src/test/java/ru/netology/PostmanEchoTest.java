package ru.netology;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


class MobileBankApiTest {
    @Test
    void shouldReturnDemoAccounts () {
        given()
                .baseUri("https://postman-echo.com")
                .body("id:3")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("id:3"));
    }

    @Test
    void shouldReturnDemoAccounts2 () {
        given()
                .baseUri("https://postman-echo.com")
                .body("currency:RUB")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("currency:RUB"));
    }

}