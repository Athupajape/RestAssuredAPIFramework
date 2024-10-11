package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase4_PutMethod {

	@Test
	public void testcase4() throws IOException {
		
		Properties pro=PropertiesHandle.readPropertiesFile("../APIFWJuly/URI.properties");
		String jsondata=JsonHandling.readJsonData("../APIFWJuly/src/test/java/org/testing/resources/updateRequestBody.json");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.putMethod(jsondata, "REAL_URI","2");
		Boolean statusCode=validateResponse.validateStatusCode(200, res);
	}
}
