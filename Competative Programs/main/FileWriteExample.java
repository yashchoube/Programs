package main;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("C:\\Users\\Yash_Choube\\Desktop\\Files\\Output1.txt");
		fw.write("Is there is output ?");
		fw.close();
		System.out.println("Done");
	}

}
