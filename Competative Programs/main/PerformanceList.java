package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceList {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
	    for(int i = 0; i < 100000; i++) {
	      list1.add(i);
	    }
	    
	    
	    List<Integer> list2 = new LinkedList<Integer>();
	    for(int i = 0; i < 100000; i++) {
	      list2.add(i);
	    }
	    
	    

	    final long time1 = estimatePerformance(list1);
	    System.out.println("Time For ArrayList : "+time1);
	    
	    final long time2 = estimatePerformance(list2);
	    
	    System.out.println("Time For LinkedList: "+time2);
	
	
	}
	
	
	private static long estimatePerformance(List<Integer> list){

	    final long start = System.nanoTime();
	    for(int i = 0; i<100000; i++){
	    	
//	    	if(list.contains(200)) {
//	    		list.remove(200);
//	    	}
	    	list.add(0,200);
	    }
	     
	    final long end = System.nanoTime();
	    final long time = end - start;
	    return time;
	  }

	
}
