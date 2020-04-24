package com.FIFO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Linereader {  

    public static void main(String args[]) throws Exception, IOException {
     
        
    	
    	
    	File fileIn1 = new File("D:\\Version31\\JavaBasic\\sample.txt");
    	 
        try (BufferedReader bf = new BufferedReader(new FileReader(fileIn1))) {//SURROUND WITH try with resources FOR THE EXCEPTIONS
 
            String readLine;
            int line = 0;
 
            while ((readLine = bf.readLine()) != null) {
                if (line % 2 != 1) {
                    System.out.println(readLine);
                }
                line++;
            }
 
        }
    }
}

