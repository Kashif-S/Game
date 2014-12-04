package com.ready.rain;

import java.io.*;
import com.ready.rain.ImageWriter;


public class WriteFile {
	int rand = (int) ImageWriter.getRand();
    public WriteFile (String path) {
        try {
        BufferedWriter out = new BufferedWriter(new FileWriter("WorldSave.txt"));
        for (int i = 0; i < 1; i++) {
        	out.newLine();
            out.write("world" + rand + ".png");
            out.newLine();
        }
            out.close();
        } catch (IOException e) {}
    }
}