package com.paramapi;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class RequestChaining {
@Test
public void RequestChainingTest() {
	
	Response res= given()
	.baseUri("http://localhost:8084")
	.contentType(ContentType.JSON)
	.when()
	.get("/projects");
	res.then().log().all();
	ArrayList<String> projId=res.jsonPath().get("projectId");
	for(String str:projId) {
		System.out.println(str);

given()
.baseUri("http://localhost:8084")
.pathParam("projectId",str)
.when()
.delete("/projects/{projectId}")
.then()
.assertThat().statusCode(204)
.log().all();

	}
}
@Test
public void addProjectWithCompletedTest() {
	
	JSONObject obj=new JSONObject();
	
	 obj.put("createdBy","deepak");
	 obj.put("createdOn", "02/02/2021");
	 obj.put("projectId","String");
	 obj.put("projectName","deepak_pro-1");
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



Response resp=given()
.contentType(ContentType.JSON)
.when()
.post("http://localhost:8084/addProject");

ArrayList<String> projectId=resp.jsonPath().get("projectId");
ArrayList<String> ProjectName=resp.jsonPath().get("projectName");
LinkedHashMap<ArrayList<String>,ArrayList<String>> map=new LinkedHashMap<ArrayLiat<String>,ArrayList<String>>();

.log().all()
.assertThat().statusCode(201);
}
}
