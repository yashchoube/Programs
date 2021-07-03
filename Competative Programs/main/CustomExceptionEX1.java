package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CustomExceptionEX1 {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\Yash_Choube\\eclipse-workspace\\Basics\\src\\main\\output.txt");
		System.out.println("Enter the lines...");
		Scanner scanner = new Scanner(System.in);
		String readLine= scanner.nextLine();
		writer.write(readLine);
		writer.close();
	}
}
