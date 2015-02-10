package com.creacodetive.patterns.strategy;

public class MP4 implements CompressionStrategy {

	@Override
	public void compress(Video file) {
		// Compress video using MP4 algorithms
		System.out.println("The video has been compressed to MP4 format.");
	}
}
