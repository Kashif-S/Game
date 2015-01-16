package com.ready.rain.entity;

import java.util.ArrayList;
import java.util.List;

import com.ready.rain.Game;
import com.ready.rain.graphics.Screen;
import com.ready.rain.graphics.Sprite;
import com.ready.rain.level.Level;
import com.ready.rain.entity.Entity;
import com.ready.rain.entity.mib.Bullet;

public class BaseBullet extends Projectile{

	public BaseBullet (int x, int y, double comp, int range) {
	super(x, y, comp, range);
	double random =   Math.random()*0.2 -0.1;
	sprite = Sprite.Bullet;
	speed = 5;
	dmg = 50;
	RPM = 20;
	ix = speed * Math.cos(angle + random);
	iy = speed * Math.sin(angle + random);
	range = 500;
	}
	public void update(){
		move();
	}
	protected void move() {
		if (!level.Bulletcollision(x, y, ix, iy, 4)){
		x += ix;
		y += iy;
		}
		for (int q = 0; q < Level.projectiles.size(); q++){
			if (Level.projectiles.get(q).range <= -350) Level.projectiles.get(q).remove();
			System.out.println(Level.projectiles.size());
		}
		
	
		
	}
	private double getrange() {
		range = 200;
		return range;
	}
	private double NewDistance() {
		double dis = 0;
		dis = Math.sqrt(Math.abs((xO - x) * (xO - x) + (yO - y) * (yO - y)));
		return dis;
	}
	public void render(Screen screen){
		screen.renderBullet((int)x - 8, (int)y - 12, this);
	}
}
