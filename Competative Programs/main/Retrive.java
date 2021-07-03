package main;

import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Retrive {

	static Map <String,Long> detail = new HashMap<String,Long>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		enterData();
		System.out.println("Enter number of query");
		int query=scanner.nextInt();
		scanner.nextLine();
		getValue(query);
		
	}
	public static void getValue(int query){
		String searchKey="";
		
		for(int i=0;i<query;i++) {
			
			System.out.println("Enter search key(Name)");
			
			searchKey=scanner.nextLine().trim();
			
			
			if(detail.get(searchKey)!=null) {
				System.out.println(detail.get(searchKey));
			}
			else {
				System.out.println("Not found");
			}
		}
	}
	
	public static void enterData() {
		
		System.out.println("Enter the number of test cases ");
		int n = scanner.nextInt();
		
		String name;
		long mobileNumber;
		
		while(n-->0) {
			System.out.println("Enter name and mobile number respectively ");
			scanner.nextLine();
			name=scanner.nextLine();
			
			mobileNumber=scanner.nextLong();
					
			detail.put(name, mobileNumber);
			
		}
		
	}
}
