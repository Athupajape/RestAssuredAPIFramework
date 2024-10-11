package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

//input -> request body
//for fetching the uri value with the help o URI key name from properties file we would need to the 
// properties class object


public class HTTPMethods {

	Properties pr;
	
	public HTTPMethods(Properties pr){
		this.pr=pr;
	}
	
	
	public Response postMethod(String requestBody,String URIKeyName) {
		
		String urivalue=pr.getProperty(URIKeyName);
		
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
	
	public Response GetAllMethod(String URIKeyName) {
		String urivalue=pr.getProperty(URIKeyName);
		
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
	
	public Response GetParticularMethod(String URIKeyName,String endpoint) {
		String urivalue=pr.getProperty(URIKeyName)+"/"+endpoint;
		
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
	
	public Response putMethod(String requestBody,String URIKeyName,String endpoint) {
		
		String urivalue=pr.getProperty(URIKeyName)+"/"+endpoint;
		
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
	
	public Response DeleteMethod(String URIKeyName,String endpoint) {
		String urivalue=pr.getProperty(URIKeyName)+"/"+endpoint;
		
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
