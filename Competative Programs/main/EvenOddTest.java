package main;

public class EvenOddTest {
	
	public static void main(String[] args) {
		
		int arr[] = {1 ,3, 2, 5, 6, 4, 7, 8, 9};
		int temp;
		int pointer1=0;
		int pointer2=arr.length-1;
	
		
		for(int i=0;i<arr.length;i++) {
			while(arr[pointer1]%2==0) {
				pointer1++;
			}
			
			while(arr[pointer2]%2!=0) {
				pointer2--;
			}
			
			if(pointer1<pointer2) {
			
			temp=arr[pointer1];
			arr[pointer1]= arr[pointer2];
			arr[pointer2]=temp;
		}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
