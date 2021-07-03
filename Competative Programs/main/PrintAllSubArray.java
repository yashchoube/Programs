package main;

public class PrintAllSubArray {
	static int sum=0;
	public static void main(String[] args) {
		int arr[]= {1,2,3} ;
		int n = arr.length;
		subArray(arr,0);
		System.out.println("Hello "+sum);
		
	}
	
	static void subArray(int arr[],int c) {
		if (c==arr.length) {
			return ;
		}
		String result="";
		for(int i=c;i<arr.length;i++) {
			sum+=arr[i];
			result+=" "+arr[i]+" ";
			System.out.print(" "+result+" ");
			System.out.println(sum);
		
		}
		 subArray(arr,++c);
	}
}
