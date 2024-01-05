
package exceptionHandling;

public class ThrowsKeywordDemo 
{
	public void m1()// throws InterruptedException
	{
		m2();
	}
	
	public void m2()// throws InterruptedException
	{
		System.out.println("M2is calling");
		
		try
		{
		Thread.sleep(2000);
		} catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("m2 call completed");
	}
	
	public static void main(String[] args)// throws InterruptedException
	{
		
		ThrowsKeywordDemo t1=new ThrowsKeywordDemo ();
		t1.m1();
		
	}

}
