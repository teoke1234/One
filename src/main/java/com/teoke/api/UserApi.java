package com.teoke.api;


import com.teoke.entity.request.UserDetails;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserApi {

    private UserApi(){}
    public static Response createUser(UserDetails userTestData) {
        return given()
                .body(userTestData)
                .contentType(ContentType.JSON)
                .post("/api/users");
    }

    public static Response getUser(int userId) {
        return given()
                .contentType(ContentType.JSON)
                .pathParam("userId", userId)
                .get("api/users/{userId}");
    }



}
