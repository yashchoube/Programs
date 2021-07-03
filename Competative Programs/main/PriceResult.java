package main;

import java.util.Scanner;

public class PriceResult {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		maximumDifference();
	}
	
	static void maximumDifference(){
		
		int count=0;
		int d = -999;
		int size = sc.nextInt();
		int [] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0;i<size-1;i++) {
			
			if(array[i]>array[i+1]) {
//				System.out.println(array[i]  +"  "+ array[i+1]);
//				System.out.println("i:"+ i);
//				System.out.println(++count);
				++count;
			}
			
			for(int j=i+1;j<size;j++) {
		
				if(array[i] < array[j]) {
					if(d<array[j] - array [i]) {
					d = array[j] - array [i];
					//System.out.println("d"+d);
					}	
				}
			
			
		}
			
		}
		
		
		if(count==(size-1)) System.out.println("-1");
		else System.out.println(d);
		
	}

}



//class Result {
//
//    /*
//     * Complete the 'maxDifference' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts INTEGER_ARRAY px as parameter.
//     */
//
//    static int d=-9999;
//    public static int maxDifference(List<Integer> x) {
//        
//    // Write your code here
//    for(int i=1; i<x.size();i++){
//        Integer price = x.get(i);
//        if(x.get(i-1) > x.get(i)){
//            continue;
//        }
//        else{
//            if(x.get(i) - x.get(i-1)>d){
//                if(d>0){
//                d = x.get(i) - x.get(i-1) ;
//                }
//            }
//                
//              
//        }
//        
//            return -1;
//        }
//        
//    }
//    return d;
//    
//
//    }
//
//}
//
//public class Solution {