package main;

public class BinarySearch {
	
	public static void main(String[] args) {
		int array[] = {10,20,50,60,80};
		int key =80;
		System.out.println(search(array,0,array.length-1,key));
	}
	
	static int search(int arr[],int start,int n,int value) {
		int mid=(start+n)/2;
		if(arr[mid]==value) {
			return arr[mid];
		}
		
		if(arr[mid]>value) {
			n=mid-1;
			return search(arr,start,n,value);
		}
		
		if(arr[mid]<value) {
			start = mid+1;
			return search(arr,start,n,value);
		}
		
		else {
			return -1;
		}
		
	}

}
