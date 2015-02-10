package com.creacodetive.patterns.singleton;

public class StaticInnerInitSingleton {

    private StaticInnerInitSingleton() {}
 
    private static class InnerLazyInit {
        private static final StaticInnerInitSingleton instance = new StaticInnerInitSingleton();
    }
 
    public static StaticInnerInitSingleton getInstance() {
        return InnerLazyInit.instance;
    }
	
}
