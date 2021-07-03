package main;

import java.util.Arrays;

public class MaxEvents {

	    public static int num_maxEvents (int[] arr, int[]dur) {
	        int drop = 0;
	        int NumOfEvents = arr.length;
	        int [][] intervals = new int[NumOfEvents][2];
	        

	        for (int i = 0; i < NumOfEvents; i++) {
	            intervals[i] = new int[] {arr[i], arr[i] + dur[i]};
	        }
	        for (int i = 0; i < NumOfEvents; i++) {
	        	for (int j = 0; j < 2; j++) {
	        	 System.out.print(intervals[i][j]+" ");
	        }
	        	System.out.println();
	        }

	        Arrays.sort(intervals, (a, b) ->(a[1] - b[1]));
	        // the finish time of first event;
	        System.out.println("After Sorting");
	        for (int i = 0; i < NumOfEvents; i++) {
	        	for (int j = 0; j < 2; j++) {
	        	 System.out.print(intervals[i][j]+" ");
	        }
	        	System.out.println();
	        }
	        
	        int curTime = intervals[0][1];

	        for (int i = 1; i < NumOfEvents; i++) {
	            int [] toSchedual = intervals[i];
	            System.out.println("=========="+toSchedual.length);
	            if (toSchedual[0] < curTime) {
	            	//System.out.println(toSchedual[0]);
	                drop++;
	            }
	            else {
	                curTime = toSchedual[1];
	            }
	            for (int k = 1; k < toSchedual.length; k++) {
	            	System.out.println(toSchedual[k]);
	            }
	        }
	        
	        
	        return NumOfEvents - drop;


	    }

	    public static void main(String[] args) {
//	        int[] arrival1 = {1,3,3,5,7};
//	        int[] duration1 = {2,2,1,2,1};
	       // System.out.println(num_maxEvents(arrival1, duration1));
	        int[] arrival2 = {1,3,3,5,7, 6, 9};
	        int[] duration2 = {2,2,1,2,1, 10, 2};
	        System.out.println(num_maxEvents(arrival2, duration2));
//	        int[] arrival = {1,3,35,7};
//	        int[] duration = {2,2,1,2,1};
//	        System.out.println(num_maxEvents(arrival, duration));
	    }

}
