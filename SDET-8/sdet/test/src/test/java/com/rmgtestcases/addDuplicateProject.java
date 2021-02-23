package com.rmgtestcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class addDuplicateProject {
	@Test
	public void  addDuplicateProjectTest() {
		
		JSONObject obj=new JSONObject();
		 obj.put("createdBy","deepak");
		 obj.put("createdOn", "string");
		 obj.put("projectId","string");
		 obj.put("projectName","deepak_pro-3");
		 obj.put("status","Created");
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
