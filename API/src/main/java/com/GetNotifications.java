package com;

import static io.restassured.RestAssured.baseURI;

import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetNotifications {
    @Test
    public void testGetNotifications()
    {
        String ACCESS_TOKEN = login.getAccessToken();
        JSONObject request = new JSONObject();
        request.put("index","1");
        request.put("count","10");
        request.put("is_not_real", null);
        baseURI = constant.BaseURL;
        Response response = RestAssured.
                given().
                header("Content-Type","application/json").
                header("Authorization","bearer" + ACCESS_TOKEN).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                get("/notifications");

        System.out.println(response.getBody().asPrettyString());


    }
}
