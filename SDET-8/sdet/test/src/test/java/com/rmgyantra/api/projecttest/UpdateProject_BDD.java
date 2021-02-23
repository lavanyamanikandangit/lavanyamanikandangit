package com.rmgyantra.api.projecttest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProject_BDD {
	@Test
	public void createProjectTest() {
		
		JSONObject obj=new JSONObject();
		
	obj.put("createdBy", "Lavanya1");
	obj.put("projectName", "Picanto");
	obj.put("status","created");
	obj.put("teamsize",12);
	
	given()
		.contentType(ContentType.JSON)
		.and()
		.body(obj)
	.when()
		.put("http://localhost:8084/projects/TY_PROJ_006")
	.then()
		.log().all()
		.assertThat().statusCode(200);
}
}
