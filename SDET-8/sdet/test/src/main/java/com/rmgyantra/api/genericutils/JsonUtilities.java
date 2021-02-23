package com.rmgyantra.api.genericutils;

import io.restassured.response.Response;

public class JsonUtilities {
	
	public String getJsonPath(String jsonXpath,Response resp) {
	   String jsonData = resp.jsonPath().get(jsonXpath);
				return jsonData;
}
}