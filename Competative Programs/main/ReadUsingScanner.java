package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadUsingScanner {

	public static void main(String[] args) throws Exception {
		File input = new File("C:\\Users\\Yash_Choube\\eclipse-workspace\\Basics\\src\\main\\input.txt");
		Scanner scanner = new Scanner(input);
		String line = scanner.nextLine();
		System.out.println(line);
	}
}
