package java_assingments;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingArrayList 
{
	public static void main(String[] args)
	{
		//Write a Java program to sort the ArrayList in Ascending order
		
		//create an array list for integer
		
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(18);
		numbers.add(34);
		numbers.add(17);
		numbers.add(75);
		numbers.add(43);
		numbers.add(29);
		
		System.out.println("ArrayList before sorting : "+numbers);
		
		//To get the arraylist in ascending order
		
		Collections.sort(numbers);
		
		//to display the arraylist after sorting i.e in ascending order
		
		System.out.println("ArrayList in Ascending order : "+numbers);
				
	}
			
}

