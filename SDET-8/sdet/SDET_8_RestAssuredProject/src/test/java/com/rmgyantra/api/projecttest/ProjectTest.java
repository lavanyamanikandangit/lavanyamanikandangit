package com.rmgyantra.api.projecttest;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ProjectTest {

	@Test
	public void getallProjectsTest() {
		Response res=RestAssured.get("http://localhost:8084/projects");
		System.out.println(res.asString());
		System.out.println(res.prettyPrint());
		
		System.out.println(res.getStatusCode());
		Assert.assertEquals(200, res.getStatusCode());
		System.out.println(res.contentType());
}
}
