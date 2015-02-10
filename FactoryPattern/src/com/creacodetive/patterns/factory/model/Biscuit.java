package com.creacodetive.patterns.factory.model;

import java.util.Arrays;

/**
 * Biscuit: Specific implementation of a Pastry
 * 
 * @author Daniel Isaac Khan Ramiro
 *
 */
public class Biscuit implements Pastry{

	private String[] ingredients = {"flour", "baking powder", "salt", "milk"};
	private boolean isSugarFree;
	private double price;
	
	public Biscuit()
	{
		System.out.println("Baking a buscuit...");
		isSugarFree = false;
		setPrice(0.35);
	}
	
	public Biscuit(String[] ingredients, boolean isSugarFree, double price)
	{
		setIngredients(ingredients);
		setSugarFree(isSugarFree);
		setPrice(price);
	}
	
	{
		setSugarFree(false);
		setPrice(0.5);
	}
	
	public String pastryName() {
		return "Biscuit";
	}
	
	public String description() {
		return "Baked and commonly flour-based food product";
	}

	public String details() {
		return "Biscuit [ingredients=" + Arrays.toString(ingredients)
				+ ", isSugarFree=" + isSugarFree + ", price=" + price + "]";
	}

	public boolean isSugarFree() {
		return isSugarFree;
	}
	public void setSugarFree(boolean isSugarFree) {
		this.isSugarFree = isSugarFree;
	}
	
	public String[] getIngredients() {
		return ingredients;
	}
	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
