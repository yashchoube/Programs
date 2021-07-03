package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Checker implements Comparator<Player>{

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		ArrayList <Player> list= new ArrayList<>();
		list.add(new Player("amy", 100));
		list.add(new Player("david", 100));
		list.add(new Player("heraldo", 50));
		list.add(new Player("aakansha", 75));
		list.add(new Player("aleksa", 150));
		Collections.sort(list,new Checker());
		System.out.println(list);
		
	}
	

			@Override
			public int compare(Player o1, Player o2) {
				// TODO Auto-generated method stub
				if(o1.score==o2.score) {
					
					return o1.name.toLowerCase().compareTo(o2.name.toLowerCase());
				}
			
				if(o1.score<o2.score) 
						return 1;
				else {
				return -1;
				}
			}
			
		
		
		
	
	
	
	
}
