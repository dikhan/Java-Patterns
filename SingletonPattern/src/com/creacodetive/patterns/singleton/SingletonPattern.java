package com.creacodetive.patterns.singleton;

import java.io.Serializable;

public class SingletonPattern implements Serializable {

	private static final long serialVersionUID = -3283340506858300161L;

	private SingletonPattern() {
		// private constructor
	}

	private static class InnerSingletonHolder {
		public static final SingletonPattern instance = new SingletonPattern();
	}

	public static SingletonPattern getInstance() {
		return InnerSingletonHolder.instance;
	}

	protected Object readResolve() {
		return getInstance();
	}

}
