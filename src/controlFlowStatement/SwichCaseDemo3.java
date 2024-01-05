package controlFlowStatement;

import java.util.Scanner;

public class SwichCaseDemo3 
{
	public static void main(String[] args)
	
	{
		/*
		 * String class provide conversion methods
		 * toUpperCase===>upper case
		 * toLowerCase===>lower case
		 */
		
		
	//	String s1="HelLo";
	//	System.out.println(s1.toUpperCase());
	//	System.out.println(s1.toLowerCase());
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name : ");
		String bname=sc.nextLine();
		
		switch (bname.toLowerCase()) 
		{
		case "chrome":
			System.out.println("Test case is executing on chrome");
			break;
			
		case "firefox":
			System.out.println("Test case is executing on firefox");
			break;
			
		case "edge":
			System.out.println("Test case is executing on edge");
			break;

		default:
			System.out.println("Please provide appropriate browser name");
			
		}
		
		
		
		
		
	}

}
