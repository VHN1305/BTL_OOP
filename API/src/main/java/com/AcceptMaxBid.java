package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AcceptMaxBid {
    @Test
    public void AcceptMaxBid(){
        JSONObject request = new JSONObject();

        RestAssured.baseURI = constant.BaseURL;

        request.put("selling_info", "3");

        String accessToken = login.getAccessToken();
        Response response = given().
                header("Content-Type","application/json").
                header("Authorization","bearer"+accessToken).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("/accept/1749");
        System.out.println(response.getBody().asPrettyString());
    }
}
