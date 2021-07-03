package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sort {

	public static void main(String[] args) {
		int [] array = {12,56,78,8,4,3,6,18,67};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int temp=array[0];
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
				i=-1;
			}
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
//			for(int i =0;i<array.length;i++) {
//				if(array[i]>first) {
//					second=first;
//					first=array[i];
//					
//				}
//				
//				else if(array[i]>second && array[i]!=first) {
//					second=array[i];
//					
//				}
//				
//			}
//			System.out.println(second);
//	}
		//blic static void main(String[] args) {
            // TODO Auto-generated method stub

//            List <Integer>lastElement = new ArrayList<Integer>();
//            lastElement.add(9);
//            lastElement.add(112);
//            lastElement.add(8);
//            lastElement.add(444);
//            Collections.sort(lastElement, new Comparator<Integer>() { 
//                 public int compare(Integer o1,  
//                                    Integer o2) 
//                 { 
//
//                 return (o2%10) - (o1%10); 
//                 } 
//             }); 
//            
//            System.out.println(lastElement);
}
}
