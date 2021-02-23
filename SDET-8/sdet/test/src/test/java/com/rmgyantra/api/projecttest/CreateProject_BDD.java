package com.rmgyantra.api.projecttest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject_BDD {
	@Test
	public void createProjectTest() {
		
		JSONObject obj=new JSONObject();
		
	obj.put("createdBy", "Lavanya");
	obj.put("projectName", "beswingt");
	obj.put("status","created");
	obj.put("teamsize",12);
	
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
