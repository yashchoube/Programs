package main;

public class SubArray {
	
	//1 2 3 4 5
	
	public static void main(String[] args) {
		int arr[] = {9,2,8,3};
		int resultSum=5;
		sum(arr, resultSum);
	}

	public static void sum(int array[],int n) {
		int sum=0;
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++) {
			sum=array[i];
			for(int j=i+1;j<=array.length;j++) {
				if(sum==n) {
					System.out.println(i +" "+(j-1));
				}
				
				if(sum>=n || j==array.length)
					break;
				sum+=array[j];
			}
		}
		
		
	}
	

}
