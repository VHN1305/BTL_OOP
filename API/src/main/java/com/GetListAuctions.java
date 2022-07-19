package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class GetListAuctions {
    @Test
    public void GetListAuctions(){
        String ACCESS_TOKEN = login.getAccessToken();
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject request = new JSONObject();
        request.put("index", "1");
        request.put("count", "100");
        httpRequest.body(request.toJSONString());
        Response response = httpRequest.given()
                .header("Content-Type","application/json")
                .header("Authorization",("bearer" + ACCESS_TOKEN))
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when().get("/auctions/7");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }
}
