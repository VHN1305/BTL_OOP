package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class edit {
    @Test
    public void edit(){
        String ACCESS_TOKEN = login.getAccessToken();
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject request = new JSONObject();
        request.put("email","vanhuyngo1305@gmail.com");
        request.put("password","123456");
        request.put("re_pass","123456");
        request.put("address","Hà Nam");
        request.put("name","Ngô Huy Văn");
        request.put("phone","0886607900");
        request.put("avatar",null);
        httpRequest.body(request.toJSONString());
        Response response = httpRequest.given()
                .header("Content-Type","application/json")
                .header("Authorization",("bearer"+ACCESS_TOKEN))
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when().post("/edit");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }
}
