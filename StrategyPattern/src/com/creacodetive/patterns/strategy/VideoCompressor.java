package com.creacodetive.patterns.strategy;

public class VideoCompressor {

	private CompressionStrategy strategy;

	public void setCompressionStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}

	public void formatVideo(Video video){
		strategy.compress(video);
	}

	public static void main(String[] args)
	{
		//Video to be formatted/compressed
		Video video = new Video();
		
		VideoCompressor videoCompressor = new VideoCompressor();
		videoCompressor.setCompressionStrategy(new MKV());
		videoCompressor.formatVideo(video);
		
		videoCompressor.setCompressionStrategy(new AVI());
		videoCompressor.formatVideo(video);
		
		videoCompressor.setCompressionStrategy(new MP4());
		videoCompressor.formatVideo(video);
		
	}
	
}
