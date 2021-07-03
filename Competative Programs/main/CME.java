package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CME {

	public static void main(String[] args) {
	
		List<String> listOfBooks = new ArrayList<>();  
	       listOfBooks.add("Programming Pearls");
	       listOfBooks.add("Clean Code");
	       listOfBooks.add("Effective Java");
	       listOfBooks.add("Code Complete");
	       
//	       Iterator<String> it = listOfBooks.iterator();
//	       while((it.hasNext())) {
//	    	   String value = it.next();
//	    	   listOfBooks.remove(value);
//	       }

	       
	        for (String string : listOfBooks) {
	    	   if(string.contains("Programming")){
	    		   listOfBooks.remove(string);
	    	   }
		}
	       
//	       for(int i=0; i<listOfBooks.size(); i++){
//	           String book = listOfBooks.get(i);
//	           if(book.contains("Programming")){
//	               System.out.println("Removing " + book);
//	               listOfBooks.remove(i); // will not throw CME
//	           }
//	       }
	       System.out.println(listOfBooks);
	       System.out.println(16+4+"Volvo");
	       System.out.println("Volvo"+16+4);
	       
	}
}
