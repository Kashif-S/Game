package com.ready.rain.graphics;

public class WorldSprite {
	
	public final int WSIZE;
	private int x, y;
	public int[] biomes;
	private World sheet;
	
	public static WorldSprite grass = new WorldSprite(16, 0, 0, World.worldtiles) ;


	public static WorldSprite voidSprite = new WorldSprite(16, 0x62F0ED);
	
	public WorldSprite (int size, int x, int y, World sheet) {
		WSIZE = size;
		biomes = new int [WSIZE * WSIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}
	
	public WorldSprite(int size, int color) {
		WSIZE = size;
		biomes = new int [WSIZE * WSIZE];
		setColor(color);
	}
	
	private void setColor(int color) {
		for (int i = 0; i < WSIZE*WSIZE; i++)
			biomes[i] = color;
		
		
	}

	private void load () {
		for (int y = 0; y < WSIZE; y++) {
			for  (int x = 0; x < WSIZE; x++) {
				biomes [x + y * WSIZE] = sheet.biomes[(x + this.x) + (y + this.y)* sheet.WSIZE ] ;
			}
		}
	}
	
}