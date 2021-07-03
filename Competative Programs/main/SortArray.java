package main;

public class SortArray {
	public static void main(String[] args) {
		int arr[]= {2,8,1,4,6};
		int temp;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					count++;
				}
			}
		}
		System.out.println(count);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
