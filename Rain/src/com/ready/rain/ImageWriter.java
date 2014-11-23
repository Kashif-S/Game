package com.ready.rain;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Random;

public class ImageWriter {
	protected static final Random random = new Random();
	protected static final Random random1 = new Random();
	private static float rand;
	private static float i = 0.5f;
	private static float rand1= i;


    public static void greyWriteImage(double [][] data){
        //this takes and array of doubles between 0 and 1 and generates a grey scale image from them

        BufferedImage image = new BufferedImage(data.length,data[0].length, BufferedImage.TYPE_INT_RGB);
        rand = random.nextInt(64);
       
        for (int y = 0; y < data[0].length; y++)
        {
        	
          for (int x = 0; x < data.length; x++)
        	  
          {
        	  /*
        	  if(Math.random() >= 0.5)rand1 -= Math.random()*0.05;
        	  if(Math.random() < 0.5)rand1 += Math.random()*0.05;    	  
      

        
        data[x][y] = rand1;*/
            if (data[x][y]>0 && data[x][y] <= 0.2){
                  data[x][y]=0.1;
              }
            if (data[x][y]>0.2 && data[x][y] <= 0.4){
                  data[x][y]=0.3;
            }
            if (data[x][y]>0 && data[x][y] <= 0.6){
                data[x][y]=0.5;
            }
            if (data[x][y]>0.6 && data[x][y] <= 0.8){
                data[x][y]=0.7;
          }
          if (data[x][y]>0.8 && data[x][y] <= 1){
              data[x][y]=0.9;
          }
            if (data[x][y]>1){
                data[x][y]=1;
            }
            if (data[x][y]<0){
                data[x][y]=0;
            }
            

       /*     if (data[x][y]<0 && data[x][y]>0.1){
                data[x][y]=0.05;
            }
            if (data[x][y]<0.1 && data[x][y]>0.2){
                data[x][y]=0.15;
            }
            if (data[x][y]<0.2 && data[x][y]>0.3){
                data[x][y]=0.25;
            }
            if (data[x][y]<0.3 && data[x][y]>0.4){
                data[x][y]=0.35;
            }
            if (data[x][y]<0.4 && data[x][y]>0.5){
                data[x][y]=0.45;
            }
            if (data[x][y]<0.5 && data[x][y]>0.6){
                data[x][y]=0.55;
            }
            if (data[x][y]<0.6 && data[x][y]>0.7){
                data[x][y]=0.65;
            }
            if (data[x][y]<0.7 && data[x][y]>0.8){
                data[x][y]=0.75;
            }
            if (data[x][y]<0.8 && data[x][y]>0.9){
                data[x][y]=0.85;
            }
            if (data[x][y]<0.9 && data[x][y]>1){
                data[x][y]=0.95;
            }*/

            
            Color col=new Color((float)data[x][y],(float)data[x][y],(float)data[x][y]); 
            image.setRGB(x, y, col.getRGB());
          }
        }
       	 // if(Math.random() >= 0.5)rand1 =  (float) (data[x][y] - Math.random()*0.1);
       	 // if(Math.random() < 0.5)rand1 = (float) (data[x][y] + Math.random()*0.1);    	 
   
        /*    if(x > 0){
              	rand1 = (float) data[x][y];
              }

          }
          
         // rand1= i;
         // if(y > 0){
          for  (int p = 0; p < data[0].length/2; p++)
          {
            	rand1 = (float) data[p][y];
           }

          
        }
   
       
for(int p = 0; p < 20;p++){
     for (int y = 0; y < data[0].length; y++)
        {
        	
          for (int x = 0; x < data.length; x++)
        	  
          {
        if(y > 0 && y < data[0].length - 1){ 
            data[x][y] = (data[x][y-1]+data[x][y+1])/2;
           }
     //   if(x > 0 && x < data.length - 1){ 
     //       data[x][y] = (data[x-1][y]+data[x+1][y])/2;
      //     }
        
        //Color col=new Color((float)data[x][y],(float)data[x][y],(float)data[x][y]); 
       // image.setRGB(x, y, col.getRGB());
        
          }
        }
}

for(int p = 0; p < 20;p++){
    for (int y = 0; y < data[0].length; y++)
       {
       	
         for (int x = 0; x < data.length; x++)
       	  
         {
   //    if(y > 0 && y < data[0].length - 1){ 
   //        data[x][y] = (data[x][y-1]+data[x][y+1])/2;
   //       }
       if(x > 0 && x < data.length - 1){ 
           data[x][y] = (data[x-1][y]+data[x+1][y])/2;
          }
       
       Color col=new Color((float)data[x][y],(float)data[x][y],(float)data[x][y]); 
       image.setRGB(x, y, col.getRGB());
       
         }
       }
}


              	*/

      

        try {
            // retrieve image
            File outputfile = new File("world" + (int)rand + ".png" );
            outputfile.createNewFile();

            ImageIO.write(image, "png", outputfile);
        } catch (IOException e) {
            //o no! Blank catches are bad
            throw new RuntimeException("I didn't handle this very well");
        }
    }

	public static float getRand() {
		return rand;
	}

	public static void setRand(float rand) {
		ImageWriter.rand = rand;
	}



}