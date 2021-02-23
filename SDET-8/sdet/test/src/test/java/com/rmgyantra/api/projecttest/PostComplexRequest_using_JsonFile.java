package com.rmgyantra.api.projecttest;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostComplexRequest_using_JsonFile {
	@Test
	public void sampleTest() {
		
	File fis=new File("./sampleProj.json");
	
	given()
		.contentType(ContentType.JSON)
		.and()
		.body(fis)
	.when()
		.post("http://localhost:8084/addProject")
	.then()
		.log().all()
		.assertThat().statusCode(201);
}
}
