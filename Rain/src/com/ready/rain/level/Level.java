package com.ready.rain.level;
import com.ready.rain.level.tile.Tile;
import com.ready.rain.graphics.Screen;
import com.ready.rain.graphics.ImageReader;
public class Level {

		protected int treenum = 0;
		protected int treenum1 = 0;
		protected boolean trees = true;
		protected int[] treepart;
		protected int width, height;
		public static int[] tiles;	
		public Level(int width, int height) {
		this.width = width;	
		this.height = height;
		tiles = new int[width * height];
		/*int red = ImageReader.red;
		int green = ImageReader.green;
		int blue = ImageReader.blue;*/

		

		generateLevel();
		}
		
		public Level (String path) {
		loadLevel (path);	
		}
		
		
		protected void generateLevel() {
			
		}
		
		private void loadLevel (String path) {
			
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
				gettile(x,y).render(x,y,screen);
			}
		}
		}
		
		public Tile gettile(int x, int y) {
			if (x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile;
			
			if (tiles[x + y * width] == 0x000000) return Tile.grass2;
			//if (tiles[x + y * width] == 20) return Tile.grass3;

			return Tile.grass;
		}
		
}


