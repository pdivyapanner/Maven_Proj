package com.api;

import org.junit.Test;
import org.junit.runner.Request;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Resr_Api {
	
	
	@Test
	public void demo() {
		
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification restassured = RestAssured.given();
	Response response = restassured.get("api/users/23");
	int statusCode = response.getStatusCode();
	System.out.println(statusCode);
	ResponseBody body = response.getBody();
	System.out.println(body.asString());
	
	
	
	
	}
	
	
	
	

}
