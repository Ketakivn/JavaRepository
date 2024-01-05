package oopPolymorphism;

public class CompileTimePoly 
{
	public void add()//with 0 parameter
	{
		System.out.println("Addition is: "+(100+200));
	}
	
	
	//1. Number of parameter 
	public void add(int a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}

	
	
	public void add(int a,int b,int c)//3 parameter
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	
	
	
	//2.Changed difference type of parameter
	public void add(double a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	
	//3. Change the order
	public void add(int a, double b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	
	//constructor overloading
	CompileTimePoly()
	{
		System.out.println("This is default constructor");
	}
	
	
	CompileTimePoly(int id)
	{
		System.out.println("This is parameterized constructor: "+id);
	}
	
	
	CompileTimePoly(String name)
	{
		System.out.println("This is parameterized constructor: "+name);
	}
	
	
	CompileTimePoly(int id,String name)
	{
		System.out.println("This is parameterized constructor: "+id+ "  " +name);
	}
	
	
	CompileTimePoly(String name,int id)
	{
		System.out.println("This is parameterized constructor: "+name+" "+id);
	}
	
	
	public static void main(String[] args)
	{

		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(100.11,200);
		c1.add(10,100);
		c1.add(10,200.90);
		c1.add(20,30,40);
	}

	
	
	
	
	
	
}
