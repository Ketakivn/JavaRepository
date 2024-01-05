package week1;

public class DatatypesDemo 
{

	

	
	public static void main(String args[]) 
	{	
		
	//Boolean true/false 1bit
		
		boolean status=true;
		System.out.println("Boolean data is: "+status);
		status=false;
		System.out.println("New updated status is: "+status);		
		//by default boolean data is false
		
		boolean new_status=true;
		System.out.println("New status is:"+new_status);
		
		System.out.println("*****************");
		/*
		 * 
		 * Character datatype size is 2 byte
		 * 1.Single character
		 * 2.Special character
		 * 3.Uni(ASCII)
		 * Numeric family
		 * A to Z: 65 to 90
		 * a to z: 97 to 122
		 * 0 to 9 : 48to 57
		 */
		char c1='A';
		System.out.println("Character data is:"+c1);
		char c2='@';
		System.out.println("Character data is:"+c2);
		
		char c3=90;//c3 accepting 90 as ascii value for some character
		System.out.println("Character for ASCII is:"+c3);//Z
		
		char c4=99;
		System.out.println("Character for ASCII is:"+c4);
		
		char c5=48;
		System.out.println("Character for ASCII is:"+c5);
		
		System.out.println("**************");
		/*
		 * Integral---->Integer
		 * 1.byte 2. shot 3. int(by default any number) 4. long
		 */
		//byte 1byte -128 to 127
		byte b1=125;
		System.out.println("Byte data is :"+b1);
		byte b2=-125;
		System.out.println("Byte data is :"+b2);
		//Type mismatch: cannot convert from int to byte
		//byte b3=-129;
		//byte b4=150;
		
		//short 2byte -32768 to 32767
		
		short s1=1500;
		System.out.println("Short data is :"+s1);
		short s2=-32768;
		System.out.println("Short data is :"+s2);
		short s3=32767;
		System.out.println("Short data is a:"+32767);
		//Type mismatch: cannot convert from int to short
		//short s4=54000;
		
		
		//int 4byte
		int i1=54000;
		System.out.println("Integer data is: "+i1);
		
		int i2=8738754;
		System.out.println("Integer data is:"+8738754);		
		//The literal 9999999999 of type int is out of range 
		//int i3=9999999999;
		
		
		//long 8byte -suffix L
		long l1=9999999999L;
		System.out.println("Long data is :"+l1);
		long l2=898;
		System.out.println("Long data is :"+l2);
	
		System.out.println("*****************************");
	
		/*
		 * floating point
		 * ===============
		 * float 4byte suffix F
		 * double 8byte
		 */
	
		//Type mismatch: cannot convert from double to float
		//float f1=56.66;
		float f1=56.66F;
		System.out.println("Float number is:"+f1);
	
		double d1=98899.6768;
		System.out.println("Double data is:"+d1);
	
	
	
	
	

	
	
	
	
	
	
	
	}











}
