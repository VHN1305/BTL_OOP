package com;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class DeleteComment {
    @Test
    public void DeleteComment() {
        JSONObject request = new JSONObject();

        baseURI = constant.BaseURL;

        String accessToken = login.getAccessToken();
        Response response = given().
                header("Content-Type","application/json").
                header("Authorization","bearer"+accessToken).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("/comments/delete/975");
        System.out.println(response.getBody().asPrettyString());
    }


}
