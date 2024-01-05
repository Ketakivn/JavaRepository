package Inheritance;

public class Child extends Parent
{

	int cid=210;
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		
		System.out.println("child id is: "+cid);
		System.out.println("Child income is $90000");
	}
	
	public Child()
	{
		super();//super constructor
		System.out.println("This is default constuctor from child");
	}
	
	
	public static void main(String[] args)
	{
		Child c1=new Child();
		c1.childIncome();
		
		
		
	}

}
