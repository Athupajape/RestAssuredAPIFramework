package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethodForDummy;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase8_GetParticularMethodDummy {

	@Test
	public void testcase8() throws IOException {
		Properties pro=PropertiesHandle.readPropertiesFile("../APIFWJuly/URI.properties");
		HTTPMethodForDummy http=new HTTPMethodForDummy(pro);
		Response res=http.DummyGetParticularMethod("DUMMY_URI","AP");
		Boolean statusCode=validateResponse.validateStatusCode(200, res,"TestCase8_GetParticularMethodDummy");
	}
}
