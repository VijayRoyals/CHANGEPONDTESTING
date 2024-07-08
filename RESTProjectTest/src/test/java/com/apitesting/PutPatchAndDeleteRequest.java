package com.apitesting;
import org.json.simple.JSONObject; 

import static org.hamcrest.Matchers.*;
import java.util.*; 
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response; 




public class PutPatchAndDeleteRequest {
	@Test
	public void PUTRequest() { 
		
		
		
		JSONObject request = new JSONObject(); 
		
		request.put("name", "vijay"); 
		request.put("job" , "Program Anaylsyt");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api"; 
		
		given().header("Content-Type", "application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).put("/users/2").then().statusCode(200).log().all(); 
		
		
	}
	
	
	@Test
	public void PATCHRequest() { 

		JSONObject request = new JSONObject(); 
		request.put("name", "vijay"); 
		request.put("job" , "Program Anaylsyt");
		System.out.println(request.toJSONString());
		baseURI = "https://reqres.in"; 
		
		given().header("Content-Type", "application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).patch("/api/users/2").then().statusCode(200).log().all(); 
		
	}
	
	@Test
	
	public void DELETERequest() { 
		baseURI = "https://reqres.in"; 
		when().delete("/api/users?page=2").then().statusCode(204).log().all(); 
	}
	
	

}
