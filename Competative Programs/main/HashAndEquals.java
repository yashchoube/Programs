package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashAndEquals {

	public static void main(String[] args) {
		Map <String,Integer> hm = new HashMap();
		Player p1 = new Player("ab", 99);
		Player p2 = new Player("ab", 99);
		
		Set<Player> setform = new HashSet<Player>();
		setform.add(p1);
		setform.add(p2);
		System.out.println(setform.size());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		p2.name="abcd";
		System.out.println(p2.name);
		hm.put("ab", 99);
		hm.put("ab",11);
		System.out.println(hm.get("ab"));
		System.out.println(hm.size());
		
	}
	
	
}
