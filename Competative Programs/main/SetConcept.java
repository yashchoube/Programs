package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		Set <Integer>newset = new HashSet();
		Set <Integer> declaredSet = new HashSet<Integer>(Arrays.asList(1,2,3,4,4));
		System.out.println(declaredSet);
		declaredSet.remove(4);
		System.out.println(declaredSet);
	}
}
