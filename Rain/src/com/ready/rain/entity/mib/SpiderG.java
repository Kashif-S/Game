package com.ready.rain.entity.mib;

import com.ready.rain.graphics.Screen;
import com.ready.rain.graphics.Sprite;

public class SpiderG extends Mob{

	public SpiderG(int x,int y){
		this.x = x << 4;
		this.y = y << 4;
		sprite = Sprite.water;
	}
	public void update() {

		
	}


	public void render(Screen screen) {
		screen.renderMob(x, y, sprite, 0);
	}

}
