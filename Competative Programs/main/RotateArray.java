package main;

public class RotateArray {
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums,k);
	}

	public static void rotate(int[] nums, int k) {
//        int [] rotate = new int [nums.length];
//        int index=0;
//        for(int i=nums.length-k;i<nums.length;i++){
//            rotate[index++]=nums[i];
//        }
//        
//        for(int i=0;i<nums.length-k;i++){
//            rotate[index++]=nums[i];
//        }
//        
//        for(int i=0;i<nums.length;i++){
//            System.out.print(rotate[i]+" ");
//        }
//        
		int arr[]= new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			arr[(i+k)%nums.length]=nums[i];
			//System.out.println((i+k)%nums.length);
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(arr[i]+" ");
		}
		}
    
}
