package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.LinkedHashMap;

public class login {
    @Test
    public void login(){
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject request = new JSONObject();
        request.put("email","vanvanvanvanvan@gmail.com");
        request.put("password","123456");
        httpRequest.body(request.toJSONString());
        Response response = httpRequest.header("Content-Type","application/json").contentType(ContentType.JSON).
                body(request.toJSONString()).when().post("/login");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());



    }
    public static String getAccessToken(){
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject request = new JSONObject();
        request.put("email","vanvanvanvanvan@gmail.com");
        request.put("password","123456");
        httpRequest.body(request.toJSONString());
        Response response = httpRequest.header("Content-Type","application/json").contentType(ContentType.JSON).
                body(request.toJSONString()).when().post("/login");

        JsonPath jp = response.jsonPath();
        LinkedHashMap<String, Object> data = jp.get("data");
        return data.get("access_token").toString();
    }
}