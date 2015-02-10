package com.creacodetive.patterns.factory.utils;
import com.creacodetive.patterns.factory.model.Biscuit;
import com.creacodetive.patterns.factory.model.Palmier;
import com.creacodetive.patterns.factory.model.Pastry;

/**
 * Factory in charge of producing the different instances of pastries
 * 
 * @author Daniel Isaac Khan Ramiro
 *
 */
public class PastryFactory {

	public static Pastry createNewPastry(String pastryType)
	{
		
		Pastry pastry = null;
		switch(pastryType.toUpperCase()){
			case "PALMIER": 
				pastry = new Palmier();
				break;
			case "BISCUIT":
				pastry = new Biscuit();
				break;				
		}
		return pastry;
	}
	
}
