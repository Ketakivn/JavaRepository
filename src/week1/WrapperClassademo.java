package week1;

public class WrapperClassademo 
{

	public static void main(String[]args)
	{
	
	//TODO Auto-generated method stub
	/*
	 * To store primitive data in the form of object( collection framework)
	 * and
	 * To convert object into primitive we use wrapper class
	 * 
	 * Wrapperclass & its method paeseDataType()
	 * 
	 * If data is not in convertible form you will get exception.
	 * NumberFormatException
	 */
	
		String s1="100";
		System.out.println(s1+100);//100100
		//string to int--->Integer wrapper class
		int num=Integer.parseInt(s1);
		System.out.println(num+100);//100+100=200
		
		String s2="22.39";
		System.out.println(s2+11.11);//22.3911.11
		//String to double---->Double wrapper class
		double d=Double.parseDouble(s2);
		System.out.println(d+11.11);//33.5//double addition
		
		String s3="100";//100ABC
		System.out.println(s3+100);//100ABC100
		//String to int--->Integer wrapper class
		int i=Integer.parseInt(s1+100);//NumberFormatException
		System.out.println(i+100);
		
		String s4="True";
		boolean b=Boolean.parseBoolean(s4);
	    System.out.println(b);
		
		String s5="Rohit";
		/*
		 * String is class in java
		 * String is collection of characters
		 * String class have inbuilt methods
		 * Specific character from string use -charAt(index)
		 */
		//character.p
	    char c=s5.charAt(3);
	    System.out.println(c);
	    
	    System.out.println("******************");
	
	    //Primitive to object(String-----valueof())
	    
	    int x=200;
	    System.out.println(x+100);//300
	    
	    //int into String
	    String ss1=String.valueOf(x);
	    System.out.println(ss1+100);//200100
	    
	    float f=23.56f;
	    System.out.println(f+11.11);
	    //float---->string
	    String ss2=String.valueOf(f);
	    System.out.println(ss2+11.11f);
	    
	    
	}
	
}
