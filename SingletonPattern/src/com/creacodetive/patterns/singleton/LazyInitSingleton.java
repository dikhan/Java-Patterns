package com.creacodetive.patterns.singleton;

public final class LazyInitSingleton {

	/**
	 * Declaring the variable volatile to ensure that the reference of the instance
	 * is not returned until the object is constructed.
	 */
	private static volatile LazyInitSingleton instance = null;

	/**
	 * Note the private access modifier: This forces the client to call the
	 * getInstance() method in order to create the instance of the class
	 */
	private LazyInitSingleton() {
	}

	public static LazyInitSingleton getInstance() {
		synchronized (LazyInitSingleton.class) {
			if (instance == null)
				instance = new LazyInitSingleton();
		}
		return instance;
	}

}
