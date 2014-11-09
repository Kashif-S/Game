package com.ready.rain.level.tile;

import com.ready.rain.graphics.Screen;
import com.ready.rain.graphics.Sprite;


public class Grass4 extends Tile {

	public Grass4(Sprite sprite) {
		super(sprite);
		
	}
public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
}
