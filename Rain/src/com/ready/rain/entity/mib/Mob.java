package com.ready.rain.entity.mib;

import com.ready.rain.Game;
import com.ready.rain.entity.Entity;
import com.ready.rain.graphics.Sprite;
import com.ready.rain.level.Level;
import com.ready.rain.level.ReadLevel;

public abstract class Mob extends Entity {

	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	protected boolean walking = false;
	
	public void move(int xa, int ya){  //the mob tracking method
		// -1, 0 , 1 are the values here that xa or ya can equal to
		if (xa > 0) dir = 1;
		if (xa < 0) dir = 3;
		if (ya > 0) dir = 2;
		if (ya < 0) dir = 0;
		
		if (!collision()) {
		x += xa;
		y += ya;
		}
	}
	
	public void update(){
		
	}
	private boolean collision(){
		boolean solid = false;
		//if (ReadLevel.tiles[(x + xa)/16 * (y+ya)/16].solid()) solid = true;
		
		//if (level.getTile((x + xa) / 16, (y + ya) / 16).solid()) solid = true;
		return solid;
	}
	public void render(){
		
	}
	
	
	
	
}

