package main;

import java.util.ArrayList;

public class ThreadLocalExample1 {

	    public static class MyRunnable implements Runnable   
	    {  
	       // private ThreadLocal<Integer> threadLocal =  
	         //      new ThreadLocal<Integer>();  
	    	int value;
	        @Override  
	        public void run() {  
	        	value = (int) (Math.random() * 50D);//x
	        	//threadLocal.set( (int) (Math.random() * 50D) );  
	            try   
	            {  
	                Thread.sleep(1000);  
	            } catch (InterruptedException e) {  
	            }  
	            System.out.println(value);  
	        }  
	    }  
	    public static void main(String[] args)   
	    {  
	        MyRunnable runnableInstance = new MyRunnable();  
	          
	        Thread t1 = new Thread(runnableInstance);  
	        Thread t2 = new Thread(runnableInstance);  
	        // this will call run() method   
	        t1.start();  
	        t2.start();  
	     
	}  
}
