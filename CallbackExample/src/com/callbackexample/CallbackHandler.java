package com.callbackexample;

/**
 * @author laoyao
 * the user must implement this interface for processing result
 */
public interface CallbackHandler {
	public abstract void onMeasurementFinished(int a, int b) ;
}
