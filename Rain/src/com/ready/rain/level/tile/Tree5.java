package com.ready.rain.level.tile;

import com.ready.rain.graphics.Screen;
import com.ready.rain.graphics.Sprite;


public class Tree5 extends Tile {

	public Tree5(Sprite sprite) {
		super(sprite);
		
	}
public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
}
