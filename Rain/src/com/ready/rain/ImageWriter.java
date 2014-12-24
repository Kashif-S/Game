package com.ready.rain;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.ready.rain.Game;

import java.util.Random;

public class ImageWriter {
	protected static final Random random = new Random();
	protected static final Random random1 = new Random();
	public static float rand;
	static int errornum = 0;
    static double datacol = 3;



    public static void greyWriteImage(double [][] data,double [][] data2,double [][] data3){
        //this takes and array of doubles between 0 and 1 and generates a grey scale image from them
    	
    	System.out.println("creating world");

        BufferedImage image = new BufferedImage(data.length,data[0].length, BufferedImage.TYPE_INT_RGB);
        rand = random.nextInt(64);
       
        for (int y = 0; y < data[0].length; y++)
        {
        	
          for (int x = 0; x < data.length; x++)
        	  
          {
// add more variety through smaller ranges
        	  /*   if (data[x][y]>= 0.5){
                data[x][y]=1;
            }
            if (data[x][y] < 0.5){
                data[x][y]=0;
            }
           if (data[x][y] >= 0.3 && data[x][y] < 0.5){
                data[x][y]=0.3;
            }
           if (data[x][y] >= 0.1 && data[x][y] < 0.3){
                data[x][y]=0;
            }
            if (data2[x][y]>= 0.5){
                data2[x][y]=1;
            }
            if (data2[x][y] < 0.5){
                data2[x][y]=0;
            }
           /* if (data2[x][y] >= 0.3 && data2[x][y] < 0.5){
                data2[x][y]=0.3;
            }
            if (data2[x][y] >= 0.1 && data2[x][y] < 0.3){
                data2[x][y]=0;
            }
            if (data3[x][y]>= 0.5){
                data3[x][y]=1;
            }
            if (data3[x][y] < 0.5 ){
                data3[x][y]=0;
            }
           /* if (data3[x][y] >= 0.3 && data3[x][y] < 0.5){
                data3[x][y]=0.3;
            }
            if (data3[x][y] >= 0.1 && data3[x][y] < 0.3){
                data3[x][y]=0;
            }*/
        	  

        	  data[x][y] *= 200;
    		  data2[x][y] *= 200;
    		  data3[x][y] *=  200;
    		  
    		  if((int)data[x][y] * 255 ==(int)data2[x][y] * 255){
    			  data[x][y] -= 1;
       		
       	  }if((int)data2[x][y] * 255 ==(int)data3[x][y] * 255){
       		data2[x][y] -= 1;
       		
       	  } if((int)data3[x][y] * 255 ==(int)data[x][y] * 255){
       		data3[x][y] -= 1;
       	  }
       	  
        	 if(data[x][y]>data2[x][y] && data[x][y] > data3[x][y]){
        		  data[x][y] = 1;
        		  data2[x][y] = 0;
        		  data3[x][y] = 0;
        		
        	  }else if(data2[x][y]>data[x][y] && data2[x][y] > data3[x][y]){
        		  data[x][y] = 0;
        		  data2[x][y] = 1;
        		  data3[x][y] = 0;
        		
        	  }else if(data3[x][y]>data[x][y] && data3[x][y] > data2[x][y]){
        		  data[x][y] = 0;
        		  data2[x][y] = 0;
        		  data3[x][y] = 1;
        		
        	  }

        //	 System.out.println("stalling...");
            
            Color col=new Color((float)data[x][y],(float)data2[x][y],(float)data3[x][y]); 
            image.setRGB(x, y, col.getRGB());
            
            
      	/*  if(x % 33 == 0){
      	  try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      	  }*/
          }
          }
       
        for(int i = 0; i < 100; i ++){
        	int y = (int) (Math.random()*data[0].length);
        	int x = (int) (Math.random()*data.length);
        	
        	
        	
        	datacol = 3;
        
        if(data[x][y] == 1 && data2[x][y] == 0&&data3[x][y] == 0){
        	datacol = 0;
        }
        if(data2[x][y] == 1&& data3[x][y] == 0&&data[x][y] == 0){
        	datacol = 1;
        }
        if(data3[x][y] == 1&& data[x][y] == 0&&data2[x][y] == 0){
        	datacol = 2;
        }
        
		  data[x][y] = 1;
		  data2[x][y] = 1;
		  data3[x][y] = 1;
		  
       // Color col=new Color((float)data[x][y],(float)data2[x][y],(float)data3[x][y]); 
       // image.setRGB(x, y, col.getRGB());
        


        	
        	
        }
      
for(int i = 0; i < 100; i++){
        for (int a = 0; a < data[0].length; a++)
        {
        	
          for (int b = 0; b < data.length; b++)
          {
        	  if(a > 0 && a < data[0].length -1 && b > 0 && b < data.length -1){
        	  if((data[a-1][b] == 1 && data2[a-1][b] == 1 && data3[a-1][b] == 1)||(data[a+1][b] == 1 && data2[a+1][b] == 1 && data3[a+1][b] == 1)||(data[a][b-1] == 1 && data2[a][b-1] == 1 && data3[a][b-1] == 1)||(data[a][b+1] == 1 && data2[a][b+1] == 1 && data3[a][b+1] == 1))
          {
        	  if(data[a][b] == 1 && datacol == 0){
        		  data[a][b] = 1;
        		  data2[a][b] = 1;
        		  data3[a][b] = 1;
        	  }else if(data2[a][b] == 1 && datacol == 1){
        		  data[a][b] = 1;
        		  data2[a][b] = 1;
        		  data3[a][b] = 1;
        	  }else if(data3[a][b] == 1 && datacol == 2){
        		  data[a][b] = 1;
        		  data2[a][b] = 1;
        		  data3[a][b] = 1;
        	  }
              Color col=new Color((float)data[a][b],(float)data2[a][b],(float)data3[a][b]); 
              image.setRGB(a, b, col.getRGB());
          }
          }
          }
        }
        
        for (int a = data[0].length; a > 0; a--)
        {
        	
          for (int b = data.length; b > 0 ; b--)
          {
        	  if(a > 0 && a < data[0].length -1 && b > 0 && b < data.length -1){
        	  if((data[a-1][b] == 1 && data2[a-1][b] == 1 && data3[a-1][b] == 1)||(data[a+1][b] == 1 && data2[a+1][b] == 1 && data3[a+1][b] == 1)||(data[a][b-1] == 1 && data2[a][b-1] == 1 && data3[a][b-1] == 1)||(data[a][b+1] == 1 && data2[a][b+1] == 1 && data3[a][b+1] == 1))
          {
        	  if(data[a][b] == 1 && datacol == 0){
        		  data[a][b] = 1;
        		  data2[a][b] = 1;
        		  data3[a][b] = 1;
        	  }else if(data2[a][b] == 1 && datacol == 1){
        		  data[a][b] = 1;
        		  data2[a][b] = 1;
        		  data3[a][b] = 1;
        	  }else if(data3[a][b] == 1 && datacol == 2){
        		  data[a][b] = 1;
        		  data2[a][b] = 1;
        		  data3[a][b] = 1;
        	  }
              Color col=new Color((float)data[a][b],(float)data2[a][b],(float)data3[a][b]); 
              image.setRGB(a, b, col.getRGB());
          }
          }
          }
        }
}
for(int i = 0; i < 200; i ++){
	int y = (int) (Math.random()*data[0].length);
	int x = (int) (Math.random()*data.length);
	
	
	
	datacol = 3;

if(data[x][y] == 1 && data2[x][y] == 0&&data3[x][y] == 0){
	datacol = 0;
}
if(data2[x][y] == 1&& data3[x][y] == 0&&data[x][y] == 0){
	datacol = 1;
}
if(data3[x][y] == 1&& data[x][y] == 0&&data2[x][y] == 0){
	datacol = 2;
}

  data[x][y] = 0;
  data2[x][y] = 0;
  data3[x][y] = 0;
  
// Color col=new Color((float)data[x][y],(float)data2[x][y],(float)data3[x][y]); 
// image.setRGB(x, y, col.getRGB());



	
	
}

for(int i = 0; i < 50; i++){
for (int a = 0; a < data[0].length; a++)
{
	
  for (int b = 0; b < data.length; b++)
  {
	  if(a > 0 && a < data[0].length -1 && b > 0 && b < data.length -1){
		  if((data[a-1][b] == 0 && data2[a-1][b] == 0 && data3[a-1][b] == 0)||(data[a+1][b] == 0 && data2[a+1][b] == 0 && data3[a+1][b] == 0)||(data[a][b-1] == 0 && data2[a][b-1] == 0 && data3[a][b-1] == 0)||(data[a][b+1] == 0 && data2[a][b+1] == 0 && data3[a][b+1] == 0))
  {
	  if(data[a][b] == 1 && datacol == 0){
		  data[a][b] = 0;
		  data2[a][b] = 0;
		  data3[a][b] = 0;
	  }else if(data2[a][b] == 1 && datacol == 1){
		  data[a][b] = 0;
		  data2[a][b] = 0;
		  data3[a][b] = 0;
	  }else if(data3[a][b] == 1 && datacol == 2){
		  data[a][b] = 0;
		  data2[a][b] = 0;
		  data3[a][b] = 0;
	  }
      Color col=new Color((float)data[a][b],(float)data2[a][b],(float)data3[a][b]); 
      image.setRGB(a, b, col.getRGB());
  }
  }
  }
}

for (int a = data[0].length; a > 0; a--)
{
	
  for (int b = data.length; b > 0 ; b--)
  {
	  if(a > 0 && a < data[0].length -1 && b > 0 && b < data.length -1){
	  if((data[a-1][b] == 0 && data2[a-1][b] == 0 && data3[a-1][b] == 0)||(data[a+1][b] == 0 && data2[a+1][b] == 0 && data3[a+1][b] == 0)||(data[a][b-1] == 0 && data2[a][b-1] == 0 && data3[a][b-1] == 0)||(data[a][b+1] == 0 && data2[a][b+1] == 0 && data3[a][b+1] == 0))
  {
	  if(data[a][b] == 1 && datacol == 0){
		  data[a][b] = 0;
		  data2[a][b] = 0;
		  data3[a][b] = 0;
	  }else if(data2[a][b] == 1 && datacol == 1){
		  data[a][b] = 0;
		  data2[a][b] = 0;
		  data3[a][b] = 0;
	  }else if(data3[a][b] == 1 && datacol == 2){
		  data[a][b] = 0;
		  data2[a][b] = 0;
		  data3[a][b] = 0;
	  }
      Color col=new Color((float)data[a][b],(float)data2[a][b],(float)data3[a][b]); 
      image.setRGB(a, b, col.getRGB());
  }
  }
  }
}
}

        try {
            // retrieve image
            File outputfile = new File("res/textures/WorldGen/world" + (int)rand + ".png" );
            outputfile.createNewFile();
            System.out.println("done");
            ImageIO.write(image, "png", outputfile);


        } catch (IOException e) {
            //o no! Blank catches are bad
            throw new RuntimeException("I didn't handle this very well");
        }
        
  
       // Game.level = new ReadLevel("/textures/world" + (int)rand + ".png" );
			Game.loaded = true;
  
    }

	public static float getRand() {
		return rand;
	}

	public static void setRand(float rand) {
		ImageWriter.rand = rand;
	}



}