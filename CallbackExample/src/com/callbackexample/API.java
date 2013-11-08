package com.callbackexample;

public class API {
	/**
	 * Here for simplicity, I just merge the function of API and scheduler
	 * But it will not cause confusion since I can always pass that handler
	 * to the scheduler
	 * @param handler
	 */
	public static void addTask(CallbackHandler handler) {
		handler.onMeasurementFinished(1, 2);
	}

}
