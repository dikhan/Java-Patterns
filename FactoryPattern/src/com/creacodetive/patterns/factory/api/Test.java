package com.creacodetive.patterns.factory.api;

public class Test {

	public static void main(String[] args)
	{
		BakeryClient bc = new BakeryClient();
		
		System.out.println("");
		System.out.println("Buying a palmier...");
		bc.orderNewPastry("palmier");
		System.out.println("Displaying Bakery's stock...");
		bc.displayStock();
		System.out.println("");
		
		System.out.println("Buying a biscuit...");
		bc.orderNewPastry("biscuit");
		System.out.println("Displaying Bakery's stock...");
		bc.displayStock();
		
	}
	
}
