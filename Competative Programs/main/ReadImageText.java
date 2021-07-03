package main;

import java.awt.Graphics2D; 
import net.sourceforge.tess4j.*; 
import java.awt.Image; 
import java.awt.image.*; 
import java.io.*; 
  
import javax.imageio.ImageIO; 

public class ReadImageText {

	public static void main(String[] args) {
		
		Tesseract tesseract = new Tesseract(); 
        try { 
  
            tesseract.setDatapath("C:\\Users\\Yash_Choube\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata"); 
  
            // the path of your tess data folder 
            // inside the extracted file 
            String text 
                = tesseract.doOCR(new File("C:\\Users\\Yash_Choube\\Pictures\\Screenshots\\test115.png")); 
  
            // path of your image file 
            System.out.print(text); 
        } 
        catch (TesseractException e) { 
            e.printStackTrace(); 
        } 
		
		
	}
}
