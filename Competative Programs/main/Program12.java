package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		int max=-1;
		String maxColourKey="";
		Map<String, Integer> hm = new HashMap<String,Integer>();
		//Scanner sc = new Scanner(System.in);
		String ball[]= {"R","R","G","B","Y","R","Y","Y","G","R"};
		for(String colourBall:ball) {
			if(!hm.containsKey(colourBall) ) {
				
				hm.put(colourBall,1);
				if(max<1) {
					max=1;
					maxColourKey=colourBall;
				}
			}
			else {
				hm.put(colourBall, hm.get(colourBall)+1);
				if(hm.get(colourBall)+1>max) {
					max=hm.get(colourBall);
					maxColourKey=colourBall;
				}
			}
		}
		
//		for(String key:hm.keySet()) {
//			if(max<hm.get(key)) {
//				max=hm.get(key);
//				maxColourKey=key;
//			}
//			
			
		//}
		
		System.out.println(maxColourKey+" "+max);
		
	}

}
