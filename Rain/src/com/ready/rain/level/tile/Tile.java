package com.ready.rain.level.tile;

import com.ready.rain.graphics.Screen;
import com.ready.rain.graphics.Sprite;

public class Tile {

	public int x, y;
	public Sprite sprite;
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile grass2 = new Grass2(Sprite.grass2);
	public static Tile grass3 = new Grass3(Sprite.grass3);
	public static Tile grass4 = new Grass4(Sprite.grass4);
	public static Tile grass5 = new Grass5(Sprite.grass5);
	public static Tile tree = new Tree(Sprite.tree);
	public static Tile tree1 = new Tree(Sprite.tree1);
	public static Tile tree2 = new Tree(Sprite.tree2);
	public static Tile tree3 = new Tree(Sprite.tree3);
	public static Tile tree4 = new Tree(Sprite.tree4);
	public static Tile tree5 = new Tree(Sprite.tree5);
	public static Tile tree6 = new Tree(Sprite.tree6);
	public static Tile tree7 = new Tree(Sprite.tree7);
	public static Tile tree8 = new Tree(Sprite.tree8);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	
	public void render(int x, int y, Screen screen) {
		
	}
	public boolean solid(){
	return false;	
	}
	}

