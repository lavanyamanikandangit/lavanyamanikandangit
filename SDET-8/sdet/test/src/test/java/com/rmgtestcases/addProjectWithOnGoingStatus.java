package com.rmgtestcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class addProjectWithOnGoingStatus {
	@Test
	public void addProjectWithOnGoingTest() {
		
		JSONObject obj=new JSONObject();
		
		 obj.put("createdBy","deepak");
		 obj.put("createdOn", "string");
		 obj.put("projectId","string");
		 obj.put("projectName","deepak_pro-2");
		 obj.put("status","OnGoing");
		 obj.put("teamSize",10);

	
	given()
		.contentType(ContentType.JSON)
		.and()
		.body(obj)
	.when()
		.post("http://localhost:8084/addProject")
	.then()
		.log().all()
		.assertThat().statusCode(201);
}
}
