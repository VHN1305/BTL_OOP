package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class TotalLikesOfAuction {
    @Test
    public void TotalLikesOfAuction(){
        String ACCESS_TOKEN = login.getAccessToken();
        JSONObject request = new JSONObject();
        RestAssured.baseURI = constant.BaseURL;
        Response response = RestAssured.
                given().
                header("Content-Type","application/json").
                header("Authorization","bearer" +  ACCESS_TOKEN).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                get("/totalLikes/1749");

        System.out.println(response.getBody().asPrettyString());
    }
}
