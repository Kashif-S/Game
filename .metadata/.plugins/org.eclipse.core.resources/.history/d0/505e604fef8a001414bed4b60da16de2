package com.ready.rain.level;
import com.ready.rain.Game;
import com.ready.rain.ImageWriter;
import com.ready.rain.WriteFile;
import com.ready.rain.level.tile.Tile;
import com.ready.rain.graphics.Screen;

public class Level {
	private static int rand = (int) ImageWriter.getRand();
	private static WriteFile WriteFile;

		public boolean menu = Game.menu;
		public boolean loaded = Game.loaded;
		public static Tile[] tiles;
		protected int width, height;
		public static int[] tilesDif;	
		public Level(int width, int height) {
		this.width = width;	
		this.height = height;
		tilesDif = new int[width * height];
		generateLevel();
		}
		
		public Level (String path) {
		loadLevel (path);	
		generateLevel();
		}
		
		
		protected void generateLevel() {
			
		}
		
		protected void loadLevel (String path) {
			
		}
		
		public void update(){
			
		}
	
		private void time() {
			
		}
		public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, yScroll);	
		int x0 = xScroll >> 4; 
		int x1 = (xScroll + screen.width + 16) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 16) >> 4;
			for (int y = y0; y < y1;y++){
				for (int x = x0; x < x1;x++){
					if (x + y * 2500 < 0 || x + y * 2500 >= 2500 * 2500){
						Tile.voidTile.render(x, y,  screen);
						tiles [x + y + 2000 * 2000].render(x, y, screen);
						continue;
						}			
					tiles[x + y * 2500].render(x, y, screen);
			}
		}
		}
		
		public  Tile getTile(int x, int y) {
			if (x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile;
			return Tile.grass;
		}


		
}


