package com.creacodetive.patterns.singleton;

public class StaticInitSingleton {

	private static final StaticInitSingleton instance;

	// Static block initialization - executed during the loading of the class and
	// even before the constructor is called.
	static {
		try {
			instance = new StaticInitSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Uffff, i was not expecting this!", e);
		}
	}

	/**
	 * Note the private access modifier: This forces the client to call the
	 * getInstance() method in order to create the instance of the class
	 */
	private StaticInitSingleton() {
	}

	public static StaticInitSingleton getInstance() {
		return instance;
	}

}
