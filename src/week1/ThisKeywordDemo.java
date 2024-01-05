package week1;

public class ThisKeywordDemo 
{
	public void m1()
	{
		System.out.println("M1() is calling.......");
		this.m2();//method using this keyword
	}
	
	public void m2()
	{
		System.out.println("M2() is calling.......");
	}
	
	
	public static void main(String[] args)
	{
		ThisKeywordDemo d1=new ThisKeywordDemo();
		d1.m1();
		
		d1.m2();
	}

}
