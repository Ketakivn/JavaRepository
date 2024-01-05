package collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo

{
	/*
	 * LinkedHashSet is implements Set interface
	 * Underline data structure is Doubly linked list
	 * It has features of List (It is ordered collection) and Set (It maintains unique elements)
	 * It is child class for HashSet
	 */

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<>();

		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(30);
		ls.add(40);
		
		System.out.println("Is LinkedHashSet empty?: "+ls.isEmpty());
		
		System.out.println("Total elements are: "+ls.size());
		
		System.out.println(ls);
		
		System.out.println(ls.contains(60));
		
		System.out.println(ls.contains(30));
		
		ls.remove(30);
		
		System.out.println(ls);
		
		
		
		
		
		
		
		
		
	}

}
