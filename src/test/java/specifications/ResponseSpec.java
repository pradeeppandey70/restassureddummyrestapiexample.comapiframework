package specifications;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

public class ResponseSpec {
	
	public static io.restassured.specification.ResponseSpecification responseSpec(int statuscode) {
		return new ResponseSpecBuilder()
		.expectContentType(ContentType.JSON).expectStatusCode(statuscode)
		.log(LogDetail.ALL).build();

	}
	
	public static io.restassured.specification.ResponseSpecification statusCode() {
		return new ResponseSpecBuilder()
		.expectContentType(ContentType.JSON)
		.log(LogDetail.ALL).build();

	}

}
