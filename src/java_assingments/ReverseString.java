package java_assingments;

public class ReverseString 
{
	//Q. Write a java program to reverse a string with and without reverse() function 
	
	public static void main(String[] args) 
	{
		// with reverse() function
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("StarAgile");
		
		System.out.println(sb);
		
		System.out.println("Reverse is : "+sb.reverse());
		
		
	System.out.println("******************************************");	
		
		//without reverse function
	
		
	String ss5="StarAgile";
	
	String res="";
	
	for(int i=ss5.length()-1;i>=0;i--)
	{
		res=res+ss5.charAt(i);
	}
	System.out.println("Reverse of "+ss5+" is="+res);
	
	
	
	
	
	
	
	}

}
