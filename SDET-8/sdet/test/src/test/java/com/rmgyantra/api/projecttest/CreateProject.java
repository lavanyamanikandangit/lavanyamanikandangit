package com.rmgyantra.api.projecttest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	@Test
	public void createProjectTest() {
		
		JSONObject obj=new JSONObject();
		
	obj.put("createdBy", "Lavanya");
	obj.put("projectName", "Picanto");
	obj.put("status","created");
	obj.put("teamSize",10);
	
		
		RequestSpecification req=RestAssured.given();  //post,put,patch we use given
		req.contentType(ContentType.JSON);
		req.body(obj);
		Response res=req.post("http://localhost:8084/addProject");
		System.out.println(res.getStatusCode());
}
}
