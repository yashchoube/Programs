package main;

public class SubArrayTest1 {
	
	public static void main(String[] args) {
		int array[]= {-1,-2,3,0,-8,-3,3,-9,13,5};
		int sum=12;
		printSubArray(array,sum);
    }

	private static void printSubArray(int arr[],int sum) {
		// TODO Auto-generated method stub
		int current_sum;
		for (int i=0;i<arr.length;i++) {
			current_sum=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				current_sum+=arr[j];
				if(current_sum==sum) {
					System.out.println("Sum "+current_sum+" Position "+(i+1)+ " to "+(j+1));
					break;
				}
				
				else if(current_sum>sum) {
					//current_sum=0;
					break;
				}
			
//			else {
//				current_sum+=arr[i];
//				
			}
//		}
		}
//		System.out.println(current_sum);
		
	}


}
