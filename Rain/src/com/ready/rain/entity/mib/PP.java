package com.ready.rain.entity.mib;

import com.ready.rain.Game;
import com.ready.rain.input.Keyboard;
import com.ready.rain.input.Mouse;
import com.ready.rain.graphics.Screen;

public class PP extends Mob{
	private Keyboard input;
	public PP (Keyboard input) {
		this.input = input;
	}
	public PP (int x, int y, Keyboard input){
		this.x = x;
		this.y = y;
		//this.x = x = ReadLevel.Readw/ 2;
		//this.y = y = ReadLevel.Readh/ 2;	
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
			
				UpdateBullet();
			
	}

	private void UpdateBullet() {
		if (Mouse.getButton() == 1){
			double adj = Mouse.getX()- Game.getScreenWidth() * Game.scale / 2;
			double opp = Mouse.getY()  - Game.getScreenHeight() * Game.scale / 2;
			double comp = Math.atan2(opp, adj);
			Fire(x, y, comp);
			System.out.println("Width " + Game.getScreenWidth() * Game.scale / 2 + " Height " + Game.getScreenHeight() * Game.scale / 2);
		//	System.out.println("Mouse X  " + Mouse.getX() + " Mouse Y " + Mouse.getY());
		}
		
	}
	public void render(){
		
	}

}
