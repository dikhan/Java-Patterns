package com.creacodetive.patterns.strategy;

public class MKV implements CompressionStrategy {

	@Override
	public void compress(Video file) {
		// Compress video using MKV algorithms
		System.out.println("The video has been compressed to MKV format.");
	}

}
