package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Yash_Choube\\eclipse-workspace\\Basics\\src\\main\\input.txt");
		FileReader fr = new FileReader(file);
		File outputFile =new File("C:\\\\Users\\\\Yash_Choube\\\\eclipse-workspace\\\\Basics\\\\src\\\\main\\\\output.txt");
		//BufferedReader br = new BufferedReader(fr);
		//BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
		FileWriter fw = new FileWriter(outputFile);
		//PrintWriter w = new PrintWriter(outputFile); 
		//String line="";
		int line=0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		while((line=fr.read())!=-1) {
			if((char)line==' ' || (char)line=='.') {continue;}
			//System.out.println("lines in file :"+(char)line);
			if(hm.containsKey((char)line)) {
				hm.put((char)line, hm.get((char)line)+1);
			}
			else {
				hm.put((char)line, 1);
			}
			
			fw.write((char)line);
		
		}
		
		
		for (char n : hm.keySet()) {
			System.out.println(hm.get(n) + " : "+n);
		}
		System.out.println(hm);
		fr.close();
		fw.close();
	}
	
}
