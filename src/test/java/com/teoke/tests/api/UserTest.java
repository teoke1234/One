package com.teoke.tests.api;

import com.teoke.api.UserApi;
import com.teoke.asserthelper.ResponseAssert;
import com.teoke.base.ApiTestSetUp;
import com.teoke.entity.request.UserDetails;
import com.teoke.entity.response.CreateUserResponse;
import com.teoke.entity.response.GetUserResponse;
import com.teoke.tags.testtype.ApiTest;
import com.teoke.testdata.UserTestData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserTest extends ApiTestSetUp {

    private final UserDetails userTestData = UserTestData.getUserDetails();

    @ApiTest
    void createUser() {
        Response response = UserApi.createUser(userTestData);

        response.prettyPrint();
        System.out.println(response.jsonPath().getString("name"));
        ResponseAssert.assertThat(response)
                .statusCodeIs(201)
                .canBeDeserializedTo(CreateUserResponse.class)
                .matchingRule(response1 -> response1.jsonPath().getString("job").equalsIgnoreCase(userTestData.getJob()))
                .matchWithSchema("create-user-response-schema.json")
                .assertAll();
    }

    @ApiTest
    void createUser2() {
        Response response = UserApi.createUser(userTestData);

        response.prettyPrint();
        System.out.println(response.jsonPath().getString("name"));
        ResponseAssert.assertThat(response)
                .statusCodeIs(201)
                .canBeDeserializedTo(CreateUserResponse.class)
                .matchingRule(response1 -> response1.jsonPath().getString("job").equalsIgnoreCase(userTestData.getJob()))
                .matchWithSchema("create-user-response-schema.json")
                .assertAll();
    }

    @ApiTest
    void getUser(){
        Response response = UserApi.getUser(2);

        response.prettyPrint();

        ResponseAssert.assertThat(response)
                .matchWithSchema("get-user-response-schema.json")
                .statusCodeIs(200)
                .matchingRule(response1 -> response1.jsonPath().getString("support.url").equalsIgnoreCase("https://reqres.in/#support-heading"))
                .canBeDeserializedTo(GetUserResponse.class)
                .assertAll();
    }

}
