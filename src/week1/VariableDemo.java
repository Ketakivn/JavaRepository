package week1;

public class VariableDemo 
{
	/*
	 * Instance variable and instance method will at the memory at the time 
	 * of object creation
	 * for every new object instance variable get new memory
	 * Static variable will get the memory only one time inside class load area 
	 * and same copy of memory will get shared with every object
	 */
	int id;//instance variable
	static String cName="StarAgile";
	
	public void display()
	{
		int marks=90;//local
		System.out.println("Student id is: "+id);
		System.out.println("Marks from display():"+marks);
		System.out.println("Company name: "+cName);
	
	}
	

	
	public static void main(String[]args)
	{
		int marks=100;//local variable
		System.out.println("Marks from main():" +marks);
		//create object to call anything from class 
		
		VariableDemo v1=new VariableDemo();
		v1.display();
		v1.id=101;
		
		System.out.println("Id is: "+v1.id);
		
		System.out.println("Company name: "+cName);
		
		
	}
}