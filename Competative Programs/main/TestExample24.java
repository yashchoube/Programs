package main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


public class TestExample24 {
	public static void main(String[] args) {
		
	
	Map <String,Integer> hm = new LinkedHashMap<String,Integer>();
	Set <Integer> set = new LinkedHashSet<Integer>();
	set.add(1);
	set.add(2);
	set.add(5);
	set.add(5);
	set.add(3);
	set.add(4);
	set.add(3);
	
	for (Integer integer : set) {
		System.out.println(integer);
		
	}
	
	
	String str ="Hi Hi i i am am nam toh suna hhi hoga";
	String [] splitArray = str.split(" ");
	hm.put("1",1);
	hm.put("1",2);
	hm.put(null,1);
	hm.put(null,2);
	hm.put(null,null);
	hm.put(" ",1);
	hm.put("", 4);
	
//	for(String word: splitArray) {
//		//System.out.println(word);
//		
//		if(hm.containsKey(word)) {
//			hm.put(word, hm.get(word)+1);
//			
//		}
//		else {
//			hm.put(word, 1);
//			
//		}
//		
//		
//	}
	
	for(String key :hm.keySet()) {
		System.out.print(key+" "+hm.get(key));
	}
	
	//input= [10,2,3,4,1,6] , sum= 16
	// output= true
	//input= [10,2,3,4,1,6], sum= 100
	//output= false
	
	// input= [10,2,3,4,1,6] , sum= 16
	//1. sort the array // [1,2,3,4,8,10]
//	20>16
//	1+2+3+10 = 16
//	input[1,2,3,4] , sum =10
	//1+2+3+4 =10 
	//output: true
	
//	input[1,2,3,4,-5] , sum =10
	//1+2+3+4 =5 
	//output: false
	// output= true
	
	
	10+2+3+1= 16
			10+6=15
			6+4+3+2+1=16
	
	}
}
