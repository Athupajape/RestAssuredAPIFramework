package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethodForDummy {
	Properties pr;
	
	public HTTPMethodForDummy(Properties pr){
		this.pr=pr;
	}
	
	public Response DummyPostMethod(String requestBody,String UriKeyName) {
		
		String urivalue=pr.getProperty(UriKeyName);
		
		Response res=given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(urivalue);
		
		System.out.println("The status code is :");
		System.out.println(res.statusCode());
		System.out.println("The response body is : ");
		System.out.println(res.asString());
		return res;
	}
	
	public Response DummyGetMethod(String UriKeyName) {
		
		String urivalue=pr.getProperty(UriKeyName);
		
		Response res=given()
		.contentType(ContentType.JSON)
		.when()
		.get(urivalue);
		
		System.out.println("The status code is :");
		System.out.println(res.statusCode());
		System.out.println("The response body is : ");
		System.out.println(res.asString());
		return res;
	}
	
	public Response DummyGetParticularMethod(String UriKeyName,String endpoint) {
		
		String urivalue=pr.getProperty(UriKeyName)+"/"+endpoint;
		
		Response res=given()
		.contentType(ContentType.JSON)
		.when()
		.get(urivalue);
		
		System.out.println("The status code is :");
		System.out.println(res.statusCode());
		System.out.println("The response body is : ");
		System.out.println(res.asString());
		return res;
	}
	
	public Response DummyPutMethod(String requestBody,String UriKeyName,String endpoint) {
		
		String urivalue=pr.getProperty(UriKeyName)+"/"+endpoint;
		
		Response res=given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.put(urivalue);
		
		System.out.println("The status code is :");
		System.out.println(res.statusCode());
		System.out.println("The response body is : ");
		System.out.println(res.asString());
		return res;
	}
	
	public Response DeleteDummyMethod(String UriKeyname,String Endpoint) {
		
		String urivalue=pr.getProperty(UriKeyname)+"/"+Endpoint;
		Response res=given()
				.contentType(ContentType.JSON)
				.when()
				.delete(urivalue);
				
				System.out.println("The status code is :");
				System.out.println(res.statusCode());
				System.out.println("The response body is : ");
				System.out.println(res.asString());
				
				return res;
	}
}
