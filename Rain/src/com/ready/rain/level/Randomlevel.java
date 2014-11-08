package com.ready.rain.level;

import java.util.Random;

public class Randomlevel extends Level{
	
	protected static final Random random = new Random();

	public Randomlevel(int width, int height) {
		super(width, height);
	}
	
	protected void generateLevel(){
			for (int y = 0; y < height; y++){
				for (int x = 0; x < width; x++) {
					tiles[x + y * width] = random.nextInt(4);
				}
			}
	}
	
	
}
