package com.ready.rain.mobs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferStrategy;


public class Animation{
	boolean dir = false;
	double rot = 0;
	
	public void AnimateLegs(BufferStrategy bs, int x,int y, boolean moving){
		
		
		
		
		if (moving == true){
		if(rot >= 70){
			dir = true;
		}
		if(rot <= -70){
			dir = false;
		}
		if(dir == false){
			rot++;
		}else{
			rot--;
		}
		}else{
			if(rot >= 0)rot -= 0.5;
			if(rot <= 0)rot += 0.5;
			
		}
		Graphics2D g1 = (Graphics2D) bs.getDrawGraphics();
		
		g1.translate(x + 100/2, y);
		g1.rotate(Math.toRadians(rot));
		g1.translate(-x - 100/2, -y);
		g1.fillRect(x, y, 100, 150);
	
		g1.dispose();
		
	Graphics2D g2 = (Graphics2D) bs.getDrawGraphics();
		
		g2.translate(x + 100/2, y);
		g2.rotate(Math.toRadians(-rot));
		g2.translate(-x - 100/2, -y);
		g2.fillRect(x, y, 100, 150);
	
		g2.dispose();
	}

}
