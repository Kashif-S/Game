package com.ready.rain.graphics;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.Spring;

import com.ready.rain.mobs.Animation;

public class LoadImages {
	

	
	public BufferedImage LoadImage(String path){
		
		try{
			return ImageIO.read(Animation.class.getResourceAsStream(path));
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;

		
	}

}
