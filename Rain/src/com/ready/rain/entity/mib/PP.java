package com.ready.rain.entity.mib;

import com.ready.rain.Game;
import com.ready.rain.input.Keyboard;

public class PP extends Mob{
	private Keyboard input;
	private boolean walking = false;
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
			
			
	}
	public void render(){
		
	}

}
