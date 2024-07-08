package com.apitesting;

import org.testng.Assert; 
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response; 

import static io.restassured.matcher.RestAssuredMatchers.*; 
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject; 



public class MITINSTITUTEMANAGEMENTREACTPROJECT {
	//@Test
	public void HomePageApiTest() { 
		
		Response response = get("http://localhost:3000/"); 
		System.out.println(response.getStatusCode()); 
		System.out.println(response.getTime()); 
		System.out.println(response.getBody().asString()); 
		System.out.println(response.getStatusLine()); 
		System.out.println(response.getHeader("content-type")); 
		
			
		int statuscode  =  response.getStatusCode(); 
		
		
		Assert.assertEquals(statuscode,  200); 
		
	}
							//BDD Framework
		//@Test
		public void GETApiTest2() {
			
			baseURI = "http://localhost:8888/"; 
			given().get("products").then().statusCode(200).body("find {it.id =1}.id", equalTo(1)).log().all(); 
//			given().get("/users?page=2").then().statusCode(200).body("data[1].email", equalTo("lindsay.ferguson@reqres.in"));//.log().all();
//		


}
		@Test
		public void POSTRequest() { 
			
			
			
			JSONObject request = new JSONObject(); 
			
			request.put("name", "vijay"); 
			request.put("job" , "Program Anaylsyt");
			
			System.out.println(request.toJSONString());
			
			baseURI = "http://localhost:8888"; 
			
			given().header("Content-Type", "/products").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).post("/products").then().statusCode(201).log().all(); 
			
			
		}
		
		
	
	
	

		

}
