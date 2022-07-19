package com;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import model.constant.constant;
import org.json.simple.JSONObject;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

public class Search {
    @Test
    public void Test_01() {
        JSONObject request = new JSONObject();

        baseURI = constant.BaseURL;

        request.put("type", "1");
        request.put("key", "10000");

        Response response = given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                get("/search");
        System.out.println(response.getBody().asPrettyString());
    }

}