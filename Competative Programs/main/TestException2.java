package main;

import java.sql.SQLException;

public class TestException2 {
	
	static void display() {
		System.out.println("Display");
		System.out.println(2/0);
	}

	public static void main(String[] args) {
		
		
		
		try {
			int a=5/0;
			int array[] ={1,2,3,4};
			System.out.println(array[5]);
		}
		
		
		catch (IllegalArgumentException | SecurityException  e) {
			// TODO: handle exception
			System.out.println("Exception");
		}
		
		catch(Exception ex) {
			System.out.println("In Parent");
		}
		
		finally {
			display();
		}
		
	}
}
