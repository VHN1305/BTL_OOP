package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class ContactUs {
    @Test
    public void ContactUs(){
        String ACCESS_TOKEN = login.getAccessToken();
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject request = new JSONObject();
        request.put("name","Huy");
        request.put("phone","0886607900");
        request.put("email","vanvanvanvanvan@gmail.com");
        request.put("content","i am the fastest man alive");
        request.put("file",null);
        request.put("report_type",3);
        httpRequest.body(request.toJSONString());
        Response response = httpRequest.given()
                .header("Content-Type","application/json")
                .header("Authorization",("bearer" + ACCESS_TOKEN))
                .contentType(ContentType.JSON)
                .when().post("/contactUs");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }
}
