package main;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution1 {
	public static void main(String[] args) {
		int sample[] = {30,20,53,14}; 
		
		System.out.println(isPalindrome(sample));
		
	}
//
//public static int maximumProfit(int budget[]) {
//		
//        int max=0;
//        
//  Arrays.sort(budget);
//        
//  for(int i=0;i<budget.length;i++){
//            
//int sum=budget[i]*(budget.length-i);
//            	if(sum>max){
//                max=sum;
//            	}
//        }
//        
//  return max;
//
     public static boolean isPalindrome(LinkedList<Integer> head) {
	
	
    
	LinkedListNode<Integer>slow=head;
	LinkedListNode<Integer>fast=head.next;
	while(fast!=null && fast.next!=null){
    		slow=slow.next;
    		fast=fast.next.next;
	}
	LinkedListNode<Integer>head2=slow.next; 
	slow.next=null;

	LinkedListNode<Integer> prev=null;
	LinkedListNode<Integer> curr=head2;
	while(curr!=null){
    		LinkedListNode<Integer> next=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=next; 
	}

	while(head!=null && prev!=null){
    		if(head.data.equals(prev.data)){
        		head=head.next;
        		prev=prev.next;
    		}
    		else
        		return false;
	}
	return true;
}


}
}
