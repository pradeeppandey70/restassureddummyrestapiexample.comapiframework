package clients;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import specifications.ReqSpec;
import specifications.ResponseSpec;

public class RestClients {

	public Response postRequest(Object body, String path,int statusCode) {
		return RestAssured.given().spec(ReqSpec.requestSpec()).
		body(body).when().
		post(path).then().
		spec(ResponseSpec.responseSpec(statusCode)).
		extract().response();

	}

	public Response getRequest(String path, int statusCode) {
		return RestAssured.given().spec(ReqSpec.requestSpec()).
		when().get(path).
		then().spec(ResponseSpec.responseSpec(statusCode)).
		extract().response();

	}

	public Response putRequest(Object body, String path, int statusCode) {
		return RestAssured.given().spec(ReqSpec.requestSpec()).
				body(body).when().
				post(path).then().
				spec(ResponseSpec.responseSpec(statusCode)).
				extract().response();


	}

	public Response deleteRequest(String path, int statusCode) { 
		return RestAssured.given().spec(ReqSpec.requestSpec()).
				when().
				delete(path).then().
				spec(ResponseSpec.responseSpec(statusCode)).
				extract().response();
	}

}
