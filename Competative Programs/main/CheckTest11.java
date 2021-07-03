package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckTest11 {


public static String StringChallenge(String str) {
    // code goes here  
	String result = "false";
    int count =0;
    Map <Character,Integer> hm = new HashMap<Character,Integer>();
    for(int i =0;i<str.length();i++){
      if(!hm.containsKey(str.charAt(i))){
        hm.put(str.charAt(i), 1);
      }
      else{
        hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
      }
    }	
		for(Character duplicate: hm.keySet()) {
			System.out.println("dupli"+duplicate);
			System.out.println(hm.get(duplicate));
			
			if(duplicate>=hm.get(duplicate)) {
				
				System.out.println("true");
			}
      else{
        //System.out.println("false");
      }
		}
		return str;
    }
    
  

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge(s.nextLine())); 
  }

}