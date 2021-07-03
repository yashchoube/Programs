package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStream {
	
	static int count=0;
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Yash_Choube\\eclipse-workspace\\Basics\\src\\main\\input.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line="";
		
		try {
			while((line=br.readLine())!=null) {
				String s[] = line.split(" ");
				//count=count+s.length;
				for (String string : s) {
					//System.out.println(string);
					count=count+string.length();
				}
				//System.out.println(count);
			}
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
