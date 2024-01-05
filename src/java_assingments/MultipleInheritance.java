package java_assingments;


		//Q.Write a Java program to implement multiple inheritance
	
	
class A
{
	public void m1()
	{
		System.out.println("M1() calling from A class");
		
	}
}

class B extends A// A is parent for B - Single level Inheritance
{
	public void m2()
	{
		System.out.println("M2() calling from B class");
	}
}

class C extends B//B is parent for C- Multiple level Inheritance
{
	public void m3()
	{
		System.out.println("M3() calling from C class");
	}
}


public class MultipleInheritance

{

	public static void main(String[] args)
	{
	
		System.out.println("Parent class reference and Parent class object");
		
		A a1=new A();
		a1.m1();//Individual method
		
		System.out.println("***************************");
		
		System.out.println("child class reference and child class object");
		B b1=new B();
		b1.m2();//Individual method
		b1.m1();//Inherited Method
		
		System.out.println("Parent class ref and child class Object=(ref)");
		A a2=new B();
		a2.m1();
		
		System.out.println("Child class ref and parent class object=(Invalid)");
		
		
		C c1=new C();
		c1.m1();//Inherited Method
		c1.m2();//Inherited Method		
		c1.m3();//Individual Method
		

		
		
		
		
	}	
}
