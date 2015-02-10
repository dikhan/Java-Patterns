package com.creacodetive.patterns.factory.api;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.creacodetive.patterns.factory.model.Pastry;
import com.creacodetive.patterns.factory.utils.PastryFactory;

/**
 * Client that would use the factory to get concrete instances of Pastry
 * 
 * @author Daniel Isaac Khan Ramiro
 *
 */
public class BakeryClient {

	private List<Pastry> pastriesList;
	
	public BakeryClient()
	{
		setPastriesList(new ArrayList<Pastry>());
	}
	
	public void orderNewPastry(String pastryType)
	{
		Pastry pastry = PastryFactory.createNewPastry(pastryType);
		if(pastry != null)
			pastriesList.add(pastry);
	}
	
	public void displayStock()
	{
		Iterator<Pastry> itr = pastriesList.iterator();
		while(itr.hasNext()) {
			Pastry pastry = itr.next();
			System.out.println(pastry.details());
		}	
	}

	public List<Pastry> getPastriesList() {
		return pastriesList;
	}

	public void setPastriesList(List<Pastry> pastriesList) {
		this.pastriesList = pastriesList;
	}
	
}
