package com;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class LikeAuction {
    @Test
    public void LikeAuction(){
        String ACCESS_TOKEN = login.getAccessToken();
        JSONObject request = new JSONObject();

        baseURI = constant.BaseURL;
        Response response = given().
                header("Content-Type","application/json").
                header("Authorization","bearer" + ACCESS_TOKEN).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("/updateLike/1749");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }
}
