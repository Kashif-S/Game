package com.ready.rain.entity.mib;

import com.ready.rain.Game;
import com.ready.rain.input.Keyboard;
import com.ready.rain.input.Mouse;
import com.ready.rain.entity.Projectile;
import com.ready.rain.graphics.Screen;

public class PP extends Mob{
	private Keyboard input;
	public PP (Keyboard input) {
		this.input = input;
	}
	public PP (int x, int y, Keyboard input){
		this.x = x;
		this.y = y;
		this.input = input;
	}

	public void update(){
		
		int xa = 0;
		int ya = 0;
				if (input.up) ya--;
				if (input.down) ya++;
				if (input.left){
					Game.facing = true;
					xa--;
				}
				if (input.right){
					Game.facing = false;
					xa++;
				}
				
				if(xa != 0 || ya != 0) move (xa,ya);
				clear();
				UpdateBullet();
			
	}

	private void clear() {
		for(int i = 0; i < level.getProjectiles().size(); i++){
			Projectile p = level.getProjectiles().get(i);
			if (p.isRemoved()) level.getProjectiles().remove(i);
		}
		
	}
	private void UpdateBullet() {
		if (Mouse.getButton() == 1){
			int range = 200;
			double adj = Mouse.getX()- Game.getScreenWidth() * Game.getscale() / 2 ;
			double opp = Mouse.getY()  - Game.getScreenHeight() * Game.getscale() / 2 ;
			double comp = Math.atan2(opp, adj) ;
			Fire(x, y, comp, range);

		}
		
	}
	public void render(){
		
	}

}
