package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ProductTest {
	
	public static void main(String[] args) {
		
		ArrayList<Product> al = new ArrayList<>();
		LinkedList<Product> ll = new LinkedList<>();
		
		Product p1 = new Product("LUX", 10);
		Product p2 = new Product("BAT",200);
		Product p3 = new Product("TV",40000);
		Product p4 = new Product("Laptop",60000);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		for (Product i : al) {
			System.out.println(i);
			
		}
		
		
		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
		ll.add(p4);
		
		System.out.println("Using LinkedList");
		for (Product i : ll) {
			System.out.println(i);
			
		}
		
		//System.out.println(al);
		
		ArrayList <Integer> list = new ArrayList<>();
		
		list.add(1);   
		list.add(2);   
		list.add(3);   
		list.add(4);   
		list.add(0,5); 
		
//		for (Integer i : list) {
//			System.out.println(i);
//		}
//		
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains(2));
		System.out.println(list.contains(7));
		
		
		//Iterator and ListIterator
		//ListIterator<Product> li = al.listIterator();
		ListIterator <Product> li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	
		
		ListIterator<Product> liReverse = al.listIterator(al.size());
		System.out.println("Reverse==============");
		while(liReverse.hasPrevious()) {
			System.out.println(liReverse.previous());
		}
	
		
		
//		ArrayList <Integer> alOne = new ArrayList<>();
//		alOne.add(1);
//		
//		
//		
//		Iterator<Integer> it = alOne.iterator();
//		while(it.hasNext()) {
//		System.out.println(it.next());
//		}
//		
	
}
	
	
}
