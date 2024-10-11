package org.testing.assertion;

public class Assertion {

	public static Boolean assert1(int expected,int actual) {
		
		if(actual==expected) {
			System.out.println("Status code is matching");
			return true;
		}
		else {
			System.out.println("Status code is not matching");
			return false;
		}
	}
	
}
