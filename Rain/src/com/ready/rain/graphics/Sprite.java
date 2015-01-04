package com.ready.rain.graphics;

public class Sprite {
	
	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles) ;
	public static Sprite grass2 = new Sprite(16, 1, 0, SpriteSheet.tiles) ;
	public static Sprite grass3 = new Sprite(16, 2, 0, SpriteSheet.tiles) ;
	public static Sprite grass4 = new Sprite(16, 3, 0, SpriteSheet.tiles) ;
	public static Sprite grass5 = new Sprite(16, 4, 0, SpriteSheet.tiles) ;
	public static Sprite desert = new Sprite(16, 0, 1, SpriteSheet.tiles) ;
	public static Sprite desert2 = new Sprite(16, 1, 1, SpriteSheet.tiles) ;
	public static Sprite desert3 = new Sprite(16, 2, 1, SpriteSheet.tiles) ;
	public static Sprite desert4 = new Sprite(16, 3, 1, SpriteSheet.tiles) ;
	public static Sprite water = new Sprite(16, 0, 2, SpriteSheet.tiles) ;
	public static Sprite Bullet = new Sprite(16, 1, 2, SpriteSheet.tiles) ;

	public static Sprite voidSprite = new Sprite(16, 0x62F0ED);
	
	public Sprite (int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int [SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int size, int color) {
		SIZE = size;
		pixels = new int [SIZE * SIZE];
		setColor(color);
	}
	
	private void setColor(int color) {
		for (int i = 0; i < SIZE*SIZE; i++)
			pixels[i] = color;
		
		
	}

	private void load () {
		for (int y = 0; y < SIZE; y++) {
			for  (int x = 0; x < SIZE; x++) {
				pixels [x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y)* sheet.SIZE ] ;
			}
		}
	}
	
}
