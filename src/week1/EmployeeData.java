package week1;

public class EmployeeData 
{
	int empid;
	String empname;
	
	public void display()
	{
		
		System.out.println("Employee id is : "+empid);
		System.out.println("Employee name is : "+empname);
	}	

	
	public static void main(String[] args)
	{
	
	EmployeeData e1=new EmployeeData();
	e1.empid=101;
	e1.empname="Priya Kadam";
	e1.display();
	
	EmployeeData e2=new EmployeeData();
	e2.empid=102;
	e2.empname="Vijay Patil";
	e2.display();
	
	EmployeeData e3=new EmployeeData();
	e3.empid=103;
	e3.empname="Ritika Joshi";
	e3.display();
	
	EmployeeData e4=new EmployeeData();
	e4.empid=104;
	e4.empname="Shreyas Kakade";
	e4.display();
	
	EmployeeData e5=new EmployeeData();
	e5.empid=105;
	e5.empname="Vedant Kulkarni";
	e5.display();
	
	}
	
}
