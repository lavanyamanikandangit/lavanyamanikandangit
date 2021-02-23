package com.paramapi;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class PathParam {
@Test
	public void PathparamTest() {
String projectId="TY_PROJ_217";
	given()
			.contentType(ContentType.JSON)
			.baseUri("http://localhost:8084")
//			.pathParam("projId","TY_PROJ_217")
			.pathParam("projId","projectId")
			.when()
			.get("/projects/{projId}")
			.then()
			.assertThat().statusCode(200)
			.and()
			.assertThat().header("Content-Type","application/json")
			.and()
			.assertThat().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
//			.assertThat().time(Matchers.lessThan(3001),TimeUnit.MILLISECONDS)
			.and()
//			.assertThat().body("projId",Matchers.equalTo("TY_PROJ_217"))
			.assertThat().body("projectId",Matchers.equalTo("projectId"))
			.log().all();	

}
}
