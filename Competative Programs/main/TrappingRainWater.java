package main;

public class TrappingRainWater {
	public static void main(String[] args) {
		int arr[]= {3,0,0,2,0,4};
		//int arr[]= {6,9,9};
		
		int left=0;
		int right=1;
		int leftElement = 0;
		int rightElement = 0;
		int sum=0;
		int maxLeft=0;
		int maxRight=0;
		for(int i=0;i<arr.length;i++) {
//			while(arr[left]<arr[right]) {
//				leftElement=arr[left];
//				rightElement=arr[right];
//				left++;
//				right++;
//			}
//			
			
			while(arr[left]>arr[right]) {
				leftElement=arr[left];
				rightElement=arr[right];
				left++;
				right++;
			}
			maxLeft=arr[left];
			maxRight=arr[right];
			
			
		}
		System.out.println("left "+leftElement+" "+"right "+rightElement);
		//System.out.println("Sum "+sum);
		System.out.println("maxleft "+maxLeft);
		System.out.println("maxRight "+maxRight);
	}

}
