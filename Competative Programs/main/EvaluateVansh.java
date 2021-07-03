package main;

import java.util.Scanner;

public class EvaluateVansh {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
	int sum=0;
	boolean flag=false;
	int n=sc.nextInt();
	int x=sc.nextInt();
	int [] arr=new int[x];
	for(int i=0;i<x;i++){
	arr[i]=sc.nextInt();
	}
	for(int i=0;i<=6;i++){
	sum+=arr[i];
	if(sum<n){

	continue;
	}else if(sum>n){
	sum=sum-arr[i];

	}else if(sum==n){
	flag=true;
	System.out.println(flag);
	break;
	}else{
	flag=false;
	System.out.println(flag);
	}
	}


	}
	}