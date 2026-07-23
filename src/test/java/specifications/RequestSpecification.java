package specifications;

import base.ConfigReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

public class RequestSpecification {
	
	public static io.restassured.specification.RequestSpecification requestSpec() {
		return new RequestSpecBuilder()
		.setBaseUri(ConfigReader.getConfig("baseurl"))
		.setContentType(ContentType.JSON)
		.setAccept(ContentType.JSON)
		.log(LogDetail.ALL).build();
	}

}
