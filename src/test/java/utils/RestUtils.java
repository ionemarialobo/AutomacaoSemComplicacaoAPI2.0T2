package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RestUtils {
    private static Response response;

    public static Response getResponse() {
        return response;
    }

    public static void setBaseURI(String uri){
        RestAssured.baseURI = uri;
    }

    public static String getBaseURI(){
        return RestAssured.baseURI;
    }

    public static Response post(Object json, ContentType contentType, String endpoint){
        return response = RestAssured.given()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .body(json)
                .when()
                .post(endpoint)
                .thenReturn();
    }

    public static Response post(Map<String, String> header, Object json, ContentType contentType, String endpoint){
        return response = RestAssured.given()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .headers(header)
                .body(json)
                .log().all()
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .extract().response();

    }

    public static Response put(Map<String, String> header, Object json, ContentType contentType, String endpoint){
        return response = RestAssured.given()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .headers(header)
                .body(json)
                .log().all()
                .when()
                .put(endpoint)
                .then()
                .log().all()
                .extract().response();

    }
    public static Response get(Map<String, String> header, String endpoint) {
        return response = RestAssured.given()
                .relaxedHTTPSValidation()
                .headers(header)
                .when()
                .get(endpoint)
                .thenReturn();
    }

    public static Response get(Map<String, String> header,
                               Map<String, String> param, String endpoint) {
        return response = RestAssured.given()
                .relaxedHTTPSValidation()
                .headers(header)
                .params(param)
                .when()
                .get(endpoint)
                .thenReturn();
    }
}
