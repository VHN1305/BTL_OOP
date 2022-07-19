package com;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class EditAuction {
    @Test
    public void EditAuction(){
        String ACCESS_TOKEN = login.getAccessToken();
        RestAssured.baseURI = constant.BaseURL;
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject request = new JSONObject();
        request.put("category_id",2);
        request.put("start_date","7/19/2022");
        request.put("end_date","7/21/2022");
        request.put("title_ni","Thor - Love and Thunder dou-tickets!!!!!!!! ");
        httpRequest.body(request.toJSONString());
        Response response = httpRequest.given()
                .header("Content-Type","application/json")
                .header("Authorization",("bearer" + ACCESS_TOKEN))
                .contentType(ContentType.JSON)
                .when().post("/auctions/edit/1794");
        ResponseBody body = response.getBody();
        System.out.println(body.asPrettyString());
    }
}
