package controlFlowStatement;

import java.util.Scanner;

public class VowelAlphabetTest 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character : ");
		String s1=sc.nextLine();
		char n=s1.charAt(0);
		
		
		if((n=='a')||(n=='e')||(n=='i')||(n=='o')||(n=='u'))
		{
			System.out.println("This character is vowel");
		}
		else
		{
			System.out.println("This character is not vowel");
		}
		
	}

}
