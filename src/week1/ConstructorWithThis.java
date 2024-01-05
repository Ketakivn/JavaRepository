package week1;

public class ConstructorWithThis
{
	//instance
	int id;
	String name;
	
	//constructor=parameterized
	public ConstructorWithThis(int id,String name)//local
	{
		//name conflict
//		id=id;
//		name=name;
		//current class variable = local variable
		this.id=id;
		this.name=name;
		
	}
	//metod
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	
	//execution	
	public static void main(String[]args)
	{
		ConstructorWithThis c1=new ConstructorWithThis(101,"Para");
		c1.show();
		
	}
}
