package com.ready.rain.level.tile;

import com.ready.rain.graphics.Screen;
import com.ready.rain.graphics.Sprite;


public class Tree7 extends Tile {

	public Tree7(Sprite sprite) {
		super(sprite);
		
	}
public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
}
