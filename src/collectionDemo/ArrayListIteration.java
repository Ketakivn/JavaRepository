package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIteration
{

	/*
	 * ArrayList is class implements List interface
	 * Under line data structure is Dynamic Array
	 * Frequent operation for ArrayList is data Retrieval
	 * List is Ordered collection
	 * List allowed Duplication
	 * List is based on Indexing
	 * Default capacity is 10 virtual segment
	 * ArrayList is non synchronized class
	 * methods:
	 * add(); get(index); size(), add(index,value); remove(index);
	 * isEmplty(); clear(); contains()
	 * 
	 */


	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(40);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(30);
		
		System.out.println(al);
		
		System.out.println("******Iteration using for loop********");

		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("*******Iteration using each loop*******");
		
		for (Integer i:al)
		{
			System.out.println(i);
			
		}
		
		
		System.out.println("*********Iteration using iterator()loop********");
		
		/*
		 * Iterator() is a method return Iterator interface object
		 * hasNext()==> confirm is list contains elements?
		 * Returns true if the iteration has more elements
		 * 
		 * next()==> return that element and increment that counter for next 
		 * element in the list.
		 * Returns true if the iteration has more elements
		 */
		
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		/*
		 * Collection is Interface
		 * Collections is call in java and this class contains static methods
		 * sort()
		 * 
		 */
		
		System.out.println("****************************");
		
		System.out.println("Before sort: "+al);
		
		Collections.sort(al);
		
		System.out.println("After sort: "+al);
		
	}

}
