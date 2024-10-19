package org.testing.assertion;

import org.testing.utilities.LogsCapture;

public class Assertion {

	public static Boolean assert1(int expected,int actual,String className) {
		
		if(actual==expected) {
			LogsCapture.takeLog("Status code is matching", className);
			return true;
		}
		else {
			LogsCapture.takeLog("Status code is matching", className);
			return false;
		}
	}
	
}
