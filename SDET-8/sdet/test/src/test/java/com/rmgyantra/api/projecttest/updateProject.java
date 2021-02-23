package com.rmgyantra.api.projecttest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateProject {
	@Test
	public void updateProjectTest() {
		
		JSONObject obj=new JSONObject();
		
	obj.put("createdBy", "Lavanya");
	obj.put("projectName", "Picanto");
	obj.put("status","completed");
	obj.put("teamsize","12");
	
	
	
		
		RequestSpecification req=RestAssured.given();  //post,put,patch we use given
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res=req.put("http://localhost:8084/projects/TY_PROJ_004");
		System.out.println(res.getStatusCode());
}
}
