package com;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.constant.constant;
import org.json.simple.JSONObject;
import org.junit.Test;

public class GetListComments {
    @Test
    public void GetListComments(){
            JSONObject request = new JSONObject();

            baseURI = constant.BaseURL;

            request.put("index", "1");
            request.put("count", "20");

            String accessToken = login.getAccessToken();
            Response response = given().
                    header("Content-Type","application/json").
                    header("Authorization","bearer"+accessToken).
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                    body(request.toJSONString()).
                    when().
                    get("/comments/1749");
            System.out.println(response.getBody().asPrettyString());
    }
}
