package com.ready.rain.entity;

import java.util.Random;

import com.ready.rain.graphics.Screen;
import com.ready.rain.level.Level;

public abstract class Entity {

	public int x;
	public int y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	
	public void update(){
			
	} 
	public void render(Screen screen){
		
	}
	
	public void remove(){
		removed = true;
	}
	
	public boolean isRemoved(){
	return removed;	
	
	}
	public void init(Level level){
		this.level = level;
	}
	public boolean can(){
		return false;
	}
	}
	
