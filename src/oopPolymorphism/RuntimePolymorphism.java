package oopPolymorphism;

public class RuntimePolymorphism 
{

	public static void main(String[] args) 
	{
		
		//parent class reference and parent class object===> parent
		
		Parent p1=new Parent();
		p1.color();//red
		
		
		//child class reference and child class object===> Parent+Child
		
		Child c1=new Child();
		c1.color();//yellow
		
		//parent reference and child object--->reference matter (parent)
		
		//Parent class method is overrides by child
		Parent p2=new Child();
		p2.color();//yellow
		
	}

}
