package main;

public class Counter{
    int count=0;//will get memory each time when the instance is created  
	  String study="JAVA";
     Counter(){  
    	 
		String str="Sai";
	count++;//incrementing value  
	System.out.println(count);  
	}  
     
public Counter(int i, int j,String study) {
		// TODO Auto-generated constructor stub
	this.study=study;
	System.out.println(this.study);
	System.out.println(i+" "+j);
	}

//     void sameAsConstructor() {
//    	 String str="Sai";
//    		count++;//incrementing value  
//    		System.out.println(count);  
//     }
	  
	public static void main(String args[]){  
	//Creating objects  
	Counter c1=new Counter();  
	Counter c2=new Counter(1,2,"ReviseJAVA");  
	Counter c3=new Counter();  
	}  
	 

}
//

