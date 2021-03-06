package com.ready.rain.graphics;

import java.util.Random;

import com.ready.rain.entity.Projectile;
import com.ready.rain.level.tile.Tile;

public class Screen {

	public int width, height;
	public int[] pixels;
	public final int MAP_SIZE = 64;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;
	
	public int xOffset, yOffset;
	
	public int [] tiles = new int [MAP_SIZE *MAP_SIZE];
	
	private Random random = new Random () ;
	
	public Screen (int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int [width * height + 48600];
		
		for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++ ) {
			tiles[i] = random.nextInt(0xffffff) ;
			tiles [0] = 0;
		}
		
		}
	
	public void clear () {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	public void renderBullet(int xp, int yp, Projectile p){
		xp -= xOffset;
		yp -= yOffset;
		 for (int y = 0; y < p.getSpriteSize(); y++) {
			 int ya =  y + yp;
			 for (int x = 0; x <  p.getSpriteSize(); x++) {
				 int xa =  x + xp;
				 	if(xa <  p.getSpriteSize() || xa >= width || ya < 0 || ya >= width)break;
				 	if (xa < 0) xa = 0;
				 	int colour = p.getSprite().pixels[x + y * 16];
				 	if (colour != 0xFFFF0AB1){
				 	pixels[xa + ya * width] =  colour;
				 	}
		 }
	}
}
	public void renderMob(int xp, int yp, Sprite sprite, int flip){
		xp -= xOffset;
		yp -= yOffset;
		 for (int y = 0; y < 32; y++) {
			 int ya =  y + yp;
			 int ys = y;
			 if (flip == 2 || flip == 3) ys = 31 - y;
			 for (int x = 0; x <  32; x++) {
				 int xa =  x + xp;
				 int xs = x;
				 	if(flip == 1 || flip == 3) xs = 31 - x;
				 	if(xa <  32 || xa >= width || ya < 0 || ya >= width)break;
				 	if(xa < 0) xa = 0;
				 	int colour = sprite.pixels[x + y * 32];
				 	if (colour != 0xFFFF0AB1){
				 	pixels[xa + ya * width] =  colour;
				 	}
		 }
	}
}
		public void renderTile(int xp, int yp, Tile tile){
			xp -= xOffset;
			yp -= yOffset;
			 for (int y = 0; y < tile.sprite.SIZE; y++) {
				 int ya =  y + yp;
				 for (int x = 0; x < tile.sprite.SIZE; x++) {
					 int xa =  x + xp;
					 	if(xa < -tile.sprite.SIZE || xa >= width || ya < 0 || ya >= width)break;
					 	if (xa < 0) xa = 0;
					 	pixels[xa + ya * width] = tile.sprite.pixels[x + y * tile.sprite.SIZE];
			 }
		}
}
		public void renderTile(int xp, int yp, Sprite sprite){
			xp -= xOffset;
			yp -= yOffset;
			 for (int y = 0; y < sprite.SIZE; y++) {
				 int ya =  y + yp;
				 for (int x = 0; x < sprite.SIZE; x++) {
					 int xa =  x + xp;
					 	if(xa < -sprite.SIZE || xa >= width || ya < 0 || ya >= width)break;
					 	if (xa < 0) xa = 0;
					 	pixels[xa + ya * width] = sprite.pixels[x + y * sprite.SIZE];
			 }
		}
}
		
		
		public void setOffset(int xOffset, int yOffset) {
			this.xOffset = xOffset;
			this.yOffset = yOffset;
		}
}
		
