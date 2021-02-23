package com.rmgyantra.api.projecttest;
import com.rmgyantra.api.projecttest.Project;
import java.util.Random;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

import java.io.File;

import io.restassured.mapper.ObjectMapper;


public class PostComplexRequest_using_PojoClass {
	@Test
	public void sampleTest() {
		Random ram = new Random();
		int randomNum = ram.nextInt(1000);
		
     Project obj = new Project("Lavanya_"+randomNum, "MorelloBlue", "Completed",  15);
		
        given()
          .contentType(ContentType.JSON)
          .body(obj, ObjectMapperType.JACKSON_1)
        .when()
          .post("http://localhost:8084/addProject")
        .then()
          .log().all()
          .assertThat().statusCode(201);
	}
}
