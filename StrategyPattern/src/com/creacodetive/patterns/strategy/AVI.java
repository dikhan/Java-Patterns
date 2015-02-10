package com.creacodetive.patterns.strategy;

public class AVI implements CompressionStrategy {

	@Override
	public void compress(Video file) {
		// Compress video using AVI algorithms
		System.out.println("The video has been compressed to AVI format.");
	}
}
