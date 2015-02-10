package com.creacodetive.patterns.factory.model;

import java.util.Arrays;

/**
 * Palmier: Specific implementation of a Pastry
 * 
 * @author Daniel Isaac Khan Ramiro
 *
 */
public class Palmier implements Pastry
{
	
	private String[] ingredients = {"puff pastry", "dough","butter","honey"};
	private boolean isSugarFree;
	private double price;
	
	public Palmier()
	{
		System.out.println("Baking a palmier...");
		isSugarFree = false;
		setPrice(0.5);
	}
	
	public Palmier(String[] ingredients, boolean isSugarFree, double price)
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
		return "Palmier";
	}
	
	public String description() {
		return "French pastry in a palm shape or a butterfly shape.";
	}

	public String details() {
		return "Palmier [ingredients=" + Arrays.toString(ingredients)
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
