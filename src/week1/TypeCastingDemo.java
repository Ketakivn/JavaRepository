package week1;

public class TypeCastingDemo 
{

	public static void main(String args[])
	{
	
	/*
	 * Primitive to Primitive
	 * 1. Implicit
	 * 
	 * 2. Explicit
	 */
		//Implicit small size--->Large size
		//byte-->char--->short--->int-->long--->float--->double
		int x=89;
		long l1=x;
		System.out.println("int to long conversion :"+l1);
		
		
		char c1='B';//2byte
		int y=c1;//4byte
		System.out.println("char to int conversion: "+y);
	
		int z=7898;//4byte
		float f1=z;//4byte
		System.out.println("int to float conversion:"+f1);
		
		long l2=6754389758L;
		float f2=l2;
		System.out.println("lon to float conversion:"+f2);
		
		
		
	//int y=l1;
		//Explicit Manual casting--cating operatot
		//double--->float--->long--->int--->short--->char-->byte
		
		double d1=787655.5677;
		float f3=(float)d1;
		System.out.println("double to float conversion is: "+f3);
		
		int a=(int)d1;//4byte
		System.out.println("double to int conversion:"+a);
	
		int b=97;//4bte
		char c5=(char) b;//2byte
		System.out.println("int to char conversion is:"+c5);
	
		byte b1=(byte) d1;
		System.out.println("double to byte conversion is :"+b1);
		
		
	
	
	}
	
	
}