package com;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class GetListBid {
    @Test
    public void GetListBid(){
        String ACCESS_TOKEN = login.getAccessToken();
        JSONObject request = new JSONObject();
        request.put("index","1");
        request.put("count","1");
        baseURI = constant.BaseURL;
        Response response = RestAssured.
                given().
                header("Content-Type","application/json").
                header("Authorization","bearer" + ACCESS_TOKEN).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                get("/bids/1");

        System.out.println(response.getBody().asPrettyString());
    }
}
