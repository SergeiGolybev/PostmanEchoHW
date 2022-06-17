package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class PostmanEchoApiTest {
    @Test
    void shouldPostData() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some value") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
        ;

    }
}