package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//C:\\Users\\Yash_Choube\\Desktop\\Files

public class FileReadExample {
	public static void main(String[] args) throws FileNotFoundException  {
//		File inputFile = new File("C:\\Users\\Yash_Choube\\Desktop\\Files\\Story.txt");
//		Scanner sc = new Scanner(inputFile);
//		String line = sc.nextLine();
//		System.out.println(line);
		
		File inputFile = new File("C:\\Users\\Yash_Choube\\Desktop\\Files\\Test.txt");
		Scanner sc = new Scanner(inputFile);
		String line ="";
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			System.out.println(line);
		}
		
		
		
		
		
	}
	
	

}
