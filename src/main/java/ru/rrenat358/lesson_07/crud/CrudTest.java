package ru.rrenat358.lesson_07.crud;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;


//ca3d54a1869ca5362ae8.free.beeceptor.com/api/users/
//https://ca3d54a1869ca5362ae8.free.beeceptor.com/api/users/



public class CrudTest {

    String BASE_URL = "https://ca3d54a1869ca5362ae8.free.beeceptor.com/api/users/";


    @Test
    public void createUser() {
        User user = new User(10,"Ольга");
        RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(user)

                .when().post(BASE_URL)

                .then().assertThat()
                .statusCode(HttpStatus.SC_CREATED)
                .extract().as(User.class);

    }













}
