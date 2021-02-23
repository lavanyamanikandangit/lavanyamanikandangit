package com.paramapi;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class QueryParam {
@Test
	public void QueryparamTest() {

	given()
			.contentType(ContentType.JSON)
			.queryParam("page","2")
			.when()
			.get("https://reqres.in/api/users")
			.then()
			.assertThat().body("data[5].first_name", Matchers.equalTo("Rachel"))
			.log().all();	
			
//	Response res = given()
//	.contentType(ContentType.JSON)
//	.queryParam("page","2")
//	.when()
//	.get("https://reqres.in/api/users");
//	ArrayList<String>  pageNo=res.jsonPath().get("data.first_name");
//	String pageNo=res.jsonPath().get("data[1].first_name");
//	System.out.println(pageNo);
//	res.then()
//			.log().all();
	
}
}
