package com.rmgtestcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;
import com.rmgyantra.api.genericutils.DataBaseUtilities;
import com.rmgyantra.api.genericutils.Endpoints;
import com.rmgyantra.api.projecttest.Project;

import static io.restassured.RestAssured.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class addSingleProjectWithCreated {
	@Test
	public void createProjectTest() throws Throwable {
		String dbProjectId1 = null;
		  int random = new Random().nextInt(2000);
		  
		Project projectObj=new Project("Deepak","Apple","Created",10);
		
	Response resp=given()
		.contentType(ContentType.JSON)
		.and()
		.body(projectObj)
	.when()
		.post(Endpoints.addProjects);
	resp.then()
		.assertThat().statusCode(201)
		.log().all();
	String actMsg=resp.jsonPath().getString("msg");
	System.out.println(actMsg);
	
	String actProjectId=resp.jsonPath().getString("msg");
	System.out.println(actProjectId);
	
	  String  dbProjectId11 = DataBaseUtilities.executeQueryAndGetData("select * from project", 1, actProjectId);
	
Assert.assertEquals(dbProjectId11, actProjectId);
		   
			
}
}
