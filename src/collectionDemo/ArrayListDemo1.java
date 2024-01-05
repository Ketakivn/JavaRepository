package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1
{

	/*
	 * ArrayList is class implements List interface
	 * Under line data structure is Dynamic Array
	 * Frequent operation for ArrayList is data Retrieval
	 * List is Ordered collection
	 * List allowed Duplication
	 * 
	 * Default capacity is 10 virtual segment
	 * ArrayList is non synchronized class
	 * methods:
	 * add(); get(index); size(), add(index,value); remove(index);
	 * isEmplty(); clear(); contains()
	 * 
	 */
	
	//List with interface
	List<Integer>l1=new ArrayList<Integer>();
	
	public static void main(String[] args)
	
	{
		
		//Generic Way - type safe and no type casting required
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(70);
		a1.add(20);
		
		System.out.println(a1);
		int num=a1.get(0);
		
		System.out.println(num);//10
		
		System.out.println("***********************");

		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Mumbai");
		loc.add("Nagpur");
		
		System.out.println(loc);
		
		
		/*Non Generic Way- 1.It is not safe 2.It need type casting
		
		/ArrayList a1=new ArrayList();
		
		/a1.add(100);
		/a1.add("M");
		/a1.add("Sarang");
		/a1.add(67.89);
		/*
		 * ArrayList is a raw type.
		 * References to generic type ArrayList<E> should be
		 * parameterized
		 */
		//System.out.println(a1);
		
		//int num=(int)a1.get(0);
		//System.out.println(num);//100
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
