package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class EditRate {
    @Test
    public void EditRate(){
        String ACCESS_TOKEN = login.getAccessToken();

        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject request = new JSONObject();
        request.put("star","5");
        request.put("content","Good");
        request.put("image",null);
        httpRequest.body(request.toJSONString());
        Response response = httpRequest.given()
                .header("Content-Type","application/json")
                .header("Authorization",("bearer" + ACCESS_TOKEN))
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when().post("/auctions/rate/edit/1749");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }
}
