package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequency {
	public static int mostFrequentElement(int[] arr) {

		   Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		   for (int i = 0; i < arr.length; i++) {
		     int key = arr[i];
		     if (map.containsKey(key)) {
		       int freq = map.get(key);
		       freq++;
		       map.put(key, freq);
		     } else {
		       map.put(key, 1);
		     }
		   }

		   int max_count = 0, res = -1;

		   for (Map.Entry<Integer, Integer> val : map.entrySet()) {
		     if (max_count < val.getValue()) {
		       res = val.getKey();
		       max_count = val.getValue();
		     }
		   }

		   return res;
		 }


		 public static void main(String[] args) {
		    int n;
		    Scanner sc = new Scanner(System.in);
		    n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    System.out.println(mostFrequentElement(arr));
		 }


}
