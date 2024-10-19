package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase1_PostMethod {

	@Test
	public void testcase() throws IOException {
		
		Properties pro=PropertiesHandle.readPropertiesFile("../APIFWJuly/URI.properties");
		String jsondata=JsonHandling.readJsonData("../APIFWJuly/src/test/java/org/testing/resources/RequestBody.json");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.postMethod(jsondata, "REAL_URI");
		Boolean statusCode=validateResponse.validateStatusCode(201, res,"TestCase1_PostMethod");
	}
}
