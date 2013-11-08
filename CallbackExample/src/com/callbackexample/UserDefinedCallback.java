package com.callbackexample;

/**
 * @author laoyao
 * An example to show how the result is used by the user class
 */
public class UserDefinedCallback implements CallbackHandler {
	public int result;

	@Override
	public void onMeasurementFinished(int a, int b) {
		result = a + b;
	}
	
	public String toString() {
		return "Result = " + result;
	}

}
