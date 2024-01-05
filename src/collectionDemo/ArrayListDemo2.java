package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo2 
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

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println("Total elements: "+al.size());
		
		System.out.println("Iteration***********************");
		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		System.out.println("******************************");
		
		ArrayList<Double> ad=new ArrayList<Double>();
		ad.add(90.89);
		ad.add(78.90);
		ad.add(67.78);
		
		System.out.println(ad);
		System.out.println("Total elements: "+ad.size());
		
		System.out.println("Iteration********************");
		
		for (double i:ad)
		{
			System.out.println(i);
		}
		
		System.out.println("******************************");
		
		ArrayList<String> name=new ArrayList();
		name.add("Kumar");
		name.add("Mita");
		name.add("Saritha");
		
		System.out.println("Total elements: "+name.size());
		System.out.println(name);
		
		System.out.println("Iteration******************");
		
		for(String i:name)
		{
			System.out.println(i);
		}
		
		System.out.println("******************************");
		
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(101);
		list.add("Sarang");
		list.add("M");
		list.add(78.78);
		list.add(9865468954L);
		
		System.out.println(list);
		
		//Object num=list.get(0);
		//System.out.println(num);
		
		System.out.println("Iteration*********************");
		
		for(Object i:list)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}

}
