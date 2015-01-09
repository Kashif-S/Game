package com.ready.rain.entity;
import com.ready.rain.Game;
import com.ready.rain.entity.Entity;
import com.ready.rain.graphics.Sprite;
import com.ready.rain.entity.mib.PP;

public abstract class Projectile extends Entity{
	
	final protected int xO, yO;
	protected double angle;
	protected Sprite sprite;
	protected double x, y;
	protected double ix,iy;
	protected double speed, RPM, dmg, range;
	protected double distance;
	
	public Projectile(int x, int y, double comp){
		angle = comp;
		this.x = x + Game.getScreenWidth()/2;
		this.y = y + Game.getScreenHeight()/2;
		xO = x;
		yO = y;
	}
	
	protected void move() {
	}
	public Sprite getSprite(){
		return sprite;
	}
	public int getSpriteSize(){
		return sprite.SIZE;
	}


	}
