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

public class CreatItem {
    @Test
    public void CreatItem(){
        String ACCESS_TOKEN = login.getAccessToken();
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();

        JSONObject request = new JSONObject();
        request.put("name","Banh Ga Tong Giang");
        request.put("starting_price",20);
        request.put("brand_id",1);
        request.put("description","ao zl");
        request.put("series","100");
        request.put("images",null);

        httpRequest.body(request.toJSONString());
        Response response = httpRequest.given().
                header("Content-Type", "application/json").
                header("Authorization",("bearer" + ACCESS_TOKEN)).
                contentType(ContentType.JSON).
                when().
                post("/items/create/1758");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }

}
