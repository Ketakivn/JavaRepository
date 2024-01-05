
package oop.DataAbstraction;

public class ChildAbstract extends AbstractDemo
{

//	@Override
//	public void show()
//	{
		
//	}
	
	
	public void childM()
	{
		System.out.println("childM() This is child class individual method");
	}

	@Override
	public void show()
	
		{
			System.out.println("Show() is inherited abstract method");
			System.out.println("Show() implemented by its child class");
			
		}
	
	public static void main(String[] args)
	{
		//child class reference and child class object
		ChildAbstract c1=new ChildAbstract();
		c1.accept();//inherited
		c1.childM();//individual
		c1.show();//inherited abstract method - override
		
		//parent class reference and parent class object - Invalid
		//cannot instantiate the type AbsteactDemo
		//AbstractDemo d1=new AbstractDemo
		
		//parent class reference and child class Object
		
		AbstractDemo d1=new ChildAbstract();
		d1.accept();
		d1.show();
		
		//child class reference and parent Object = Invalid
		
		
		
		
		
	}
		
		
		
		
		
	
	
	
}
	
	

