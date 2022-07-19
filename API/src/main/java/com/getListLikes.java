package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class getListLikes {
    @Test
    public void getListLikes() {
        String ACCESS_TOKEN = login.getAccessToken();
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();

        JSONObject request = new JSONObject();
        request.put("index", "1");
        request.put("count", "1");

        httpRequest.body(request.toJSONString());

        Response response = httpRequest.
                header("Content-Type","application/json").
                header("Authorization",("bearer" + ACCESS_TOKEN)).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                get("/likes/0");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }
}
