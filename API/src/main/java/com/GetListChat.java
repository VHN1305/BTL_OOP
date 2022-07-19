package com;

import static io.restassured.RestAssured.baseURI;

import model.constant.constant;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

public class GetListChat {
    @Test
    public void GetListChat()
    {
        String ACCESS_TOKEN = login.getAccessToken();
        JSONObject request = new JSONObject();
        baseURI = constant.BaseURL;
        Response response = RestAssured.
                given().
                header("Content-Type","application/json").
                header("Authorization","bearer" +  ACCESS_TOKEN).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                get("/chat");

        System.out.println(response.getBody().asPrettyString());


    }
}