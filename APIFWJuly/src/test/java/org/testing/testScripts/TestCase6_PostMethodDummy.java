package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethodForDummy;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase6_PostMethodDummy {

	@Test
	public void testcase6() throws IOException {
		Properties pro=PropertiesHandle.readPropertiesFile("../APIFWJuly/URI.properties");
		String jsondata=JsonHandling.readJsonData("../APIFWJuly/src/test/java/org/testing/resources/DummyRequestBody.json");
		HTTPMethodForDummy http=new HTTPMethodForDummy(pro);
		Response res=http.DummyPostMethod(jsondata, "DUMMY_URI");
		Boolean statusCode=validateResponse.validateStatusCode(201, res,"TestCase6_PostMethodDummy");
	}
}
