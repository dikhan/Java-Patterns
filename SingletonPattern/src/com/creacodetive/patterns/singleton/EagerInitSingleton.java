package com.creacodetive.patterns.singleton;

public final class EagerInitSingleton {

	private static EagerInitSingleton instance = new EagerInitSingleton();

	/**
	 * Note the private access modifier: This forces the client to call the
	 * getInstance() method in order to create the instance of the class
	 */
	private EagerInitSingleton() {
	}

	/**
	 * Method in charge of returning the actual instance of the singleton class.
	 * 
	 * @return
	 */
	public static EagerInitSingleton getInstance() {
		return instance;
	}

}
