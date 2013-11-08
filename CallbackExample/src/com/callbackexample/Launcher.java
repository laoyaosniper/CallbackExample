package com.callbackexample;

public class Launcher {

	/**
	 * It just shows how the user define the result callback, add a newTask
	 * and then get the result by letting scheduler run the callback function
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedCallback foo = new UserDefinedCallback();
		System.out.println(foo.toString());
		API.addTask(foo);
		System.out.println(foo.toString());

	}

}
