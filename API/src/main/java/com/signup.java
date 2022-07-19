package com;

import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class signup {
    @Test
    public void signup(){
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject request = new JSONObject();
        request.put("email","vanvanvanvanvan@gmail.com");
        request.put("password","123456");
        request.put("re_pass","123456");
        request.put("address","HN");
        request.put("name","Ngo Van Huy");
        request.put("phone","0886607900");
        request.put("avatar",null);
        httpRequest.body(request.toJSONString());
        Response response = httpRequest.given().
                header("Content-Type","application/json").contentType(ContentType.JSON).
                accept(ContentType.JSON).body(request.toJSONString()).
                when().post("/signup");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }
}
