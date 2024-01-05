package week1;

public class MethodDemo 
{
	public void startApp()
	{
		System.out.println("Instance method is calling....");
	}
	
	
	public static void runApp()
	{
		System.out.println("Static method is calling.......");
		
	}
	
	
	public static void main(String[] args)
	{
		//Static method you can call without object
		//Static you can call directly without class name (same class)
		//static you can call with class name(different class calling)
		runApp();
		MethodDemo.runApp();// (to create any reusable code)
	
	MethodDemo m1=new MethodDemo();
	
	m1.startApp();
	//The static method runApp() from the type MethodDemo 
	//should accessed in a static way
	//m1.runApp();
	
	}

}
