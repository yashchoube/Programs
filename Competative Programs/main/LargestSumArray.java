package main;

public class LargestSumArray {
	public static void main(String[] args) {
		int arr[]= { -2, -3, 4, -1, -2, 1, 5, -3};
		int n=arr.length;
		int sum=0;
		int max=-9999;
		for(int i =0;i<arr.length;i++) {
			sum=0;
			for (int j=i;j<n;j++) {
				sum+=arr[j];
			
			
			if(max<sum) {
				max=sum;
			}
			}
		}
		System.out.println(max);
	}

}
