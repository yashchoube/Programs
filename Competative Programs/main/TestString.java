package main;

import java.util.HashMap;
import java.util.Map;

public class TestString {
	
public static void main(String[] args) {
	String name = "gibblegabblerk";
	
	
//	for(int i=0;i<name.length();i++) {
//		boolean unique=true;
//		for(int j=i+1;j<name.length()-1;j++) {
//			if(name.charAt(i)==name.charAt(j)) {
//				unique=false;
//				
//			}
//			
//		}
//		if(unique) {
//			System.out.println(name.charAt(i));
//			break;
//			
//		}
//			
//		}
//	
		
	
	
	
	
	
	
	
	
	Map <Character,Integer> hm = new HashMap<Character,Integer>();
	
	for(int i=0;i<name.length();i++) {
		if(hm.containsKey(name.charAt(i))){
			hm.put(name.charAt(i), 2);
		}
		else {
			hm.put(name.charAt(i), i);
		}
		
		
		
	}
	
	for (Character key : hm.keySet()) {
		int value=0;
		int newValue=hm.get(key);
//		if(hm.get(key) instanceof count ) {
//			value=((count) hm.get(key)).getIndex();
//		}
		if(value==1) {
			System.out.print(key+" "+value+"\n");	
			
		}
		
		
	}
	
	
	
	
	
}
}

class count{
	
	int c;
	int index;
	
	count(int index){
		this.index=index;
		c=1;
	}
	
	int getIndex() {
		return index;
	}
}
