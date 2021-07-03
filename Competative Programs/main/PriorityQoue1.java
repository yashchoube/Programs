package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQoue1 {
	public static void main(String[] args) {
		int arr[] = {3,9,4};
		System.out.println(buyTicket(arr,2));

	}

	public static int buyTicket(int arr[], int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		Queue<Integer> q=new LinkedList<>();
		
		int time=0;
		for(int i:arr)
		{
			pq.add(i);
			q.add(i);
		}
		boolean myTicket=false;
		while(!myTicket) {
			int val=q.remove();
			if(pq.peek()>val)
			{
				q.add(val);
				if(k==0)
				{
					k=q.size()-1;
				}
				else {
				k--;
				}
			}
			else {
				pq.remove();
				time++;
				if(k==0)
				{
					myTicket=true;
				}
	            		else{
	k--;
	}
			}
		}
		return time;
	}
	}

