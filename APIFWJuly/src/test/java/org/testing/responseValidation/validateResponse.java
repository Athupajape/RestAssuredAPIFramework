package org.testing.responseValidation;

import org.testing.assertion.Assertion;

import io.restassured.response.Response;

public class validateResponse {

	public static Boolean validateStatusCode(int expectedStatusCode,Response res,String className) {
		
		int actualStatusCode=res.statusCode();
		
		Boolean result=Assertion.assert1(expectedStatusCode, actualStatusCode,className);
		return result;
	}
}
