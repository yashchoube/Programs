package main;

import java.util.ArrayList;

public class PrimeFactor {

	public static void primeFactors(int n) 
    { 
        // Print the number of 2s that divide n 
		ArrayList<Integer> al = new ArrayList<Integer>();
	
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
                al.add(i);
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
           al.add(n);
    } 
  
    public static void main (String[] args) 
    { 
        int n = 315; 
        primeFactors(n); 
    } 
} 
