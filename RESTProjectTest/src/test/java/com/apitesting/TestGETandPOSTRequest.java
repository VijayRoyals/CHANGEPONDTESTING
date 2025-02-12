<<<<<<< HEAD
package com.apitesting;
import org.json.simple.JSONObject; 

import static org.hamcrest.Matchers.*;
import java.util.*; 
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response; 
@Test
public class TestGETandPOSTRequest {
	
	
	
	public void GETRequest() { 
		  //1st validation by id 
		baseURI = "https://reqres.in/api"; 
		given().get("/unknown").then().statusCode(200).body("data[0].id", equalTo(1)).log().all(); 
		
		
			//2nd validation by name 
		given().get("/unknown"). 
		then().statusCode(200). 
		body("data[1].name", equalTo("fuchsia rose")). 
		body("data[1].id", equalTo(2)).log().all(); 
	}
	
	
	public void GETRequest2() { 
		//3rd validation by group 
		baseURI = "https://reqres.in/api"; 
		
		given().get("/users?page=2").then().statusCode(200).body("data.firstname", hasItems("Lindsay", "Tobias")); 
		
	}
	public void POSTRequest() { 
		Map<String, Object> map = new HashMap<String, Object>(); //collection 
		
		JSONObject request = new JSONObject(map); 
		
		request.put("name", "VIJAY"); 
		request.put("job", "Software Developer"); 
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api"; 
		
		given().header("Content-Type", "application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).post("/users").then().statusCode(201).log().all(); 
	}

}
=======
package com.apitesting;
import org.json.simple.JSONObject; 

import static org.hamcrest.Matchers.*;
import java.util.*; 
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response; 
@Test
public class TestGETandPOSTRequest {
	
	
	
	public void GETRequest() { 
		  //1st validation by id 
		baseURI = "https://reqres.in/api"; 
		given().get("/unknown").then().statusCode(200).body("data[0].id", equalTo(1)).log().all(); 
		
		
			//2nd validation by name 
		given().get("/unknown"). 
		then().statusCode(200). 
		body("data[1].name", equalTo("fuchsia rose")). 
		body("data[1].id", equalTo(2)).log().all(); 
	}
	
	
	public void GETRequest2() { 
		//3rd validation by group 
		baseURI = "https://reqres.in/api"; 
		
		given().get("/users?page=2").then().statusCode(200).body("data.firstname", hasItems("Lindsay", "Tobias")); 
		
	}
	public void POSTRequest() { 
		Map<String, Object> map = new HashMap<String, Object>(); //collection 
		
		JSONObject request = new JSONObject(map); 
		
		request.put("name", "VIJAY"); 
		request.put("job", "Software Developer"); 
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api"; 
		
		given().header("Content-Type", "application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).post("/users").then().statusCode(201).log().all(); 
	}

}
>>>>>>> eca3ecdc772315816e951b84e1b630762b5c3e2f
