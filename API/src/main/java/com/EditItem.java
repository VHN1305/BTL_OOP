package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class EditItem {
    @Test
    public void EditItem(){
        String ACCESS_TOKEN = login.getAccessToken();
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject request = new JSONObject();
        request.put("name","May anh 80s");
        request.put("starting_price",300);
        request.put("brand_id",1);
        request.put("description","may ngon lam dooooo");
        request.put("series","90");
        request.put("images",null);
        httpRequest.body(request.toJSONString());
        Response response = httpRequest.given()
                .header("Content-Type","application/json")
                .header("Authorization",("bearer" + ACCESS_TOKEN))
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when().post("/items/edit/466");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }
}

