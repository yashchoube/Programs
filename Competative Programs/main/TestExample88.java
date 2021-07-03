package main;

import java.util.HashMap;
import java.util.Map;

public class TestExample88 {
	public static void main(String[] args) {
		String str= "delhi,bombay,banglore,pune,delhi,pune,goa,delhi,banglore";
		String str2[]=str.split(",");
		
		Map <String,Integer> hm = new HashMap<String,Integer>();
		
		for(String s:str2 ) {
			if(!hm.containsKey(s))
				hm.put(s, 1);
			else {
				hm.put(s, hm.get(s)+1);
			}
			
			
		}
		
		for(String word:hm.keySet()) {
			System.out.println(word);
		}
		
		for(String word:hm.keySet()) {
			System.out.println(word+" "+hm.get(word));
		}
		
		
		
	}

}
