package oopPolymorphism;

public class AmazonPayment
{

	public void Payment(int cash)
	{
		System.out.println("Payment by cast on delivery: "+cash);
	}

	public void Payment(String CCName, int amt)
	{
		System.out.println("Payment by Credit Card:  "+CCName+" "+amt);
	}
	
	public void Payment(int amt, String DCName)
	{
		System.out.println("Payment by Debit Card: "+DCName+" "+amt);
	}
	
	public void Payment(String bname, int acno,int amt )
	{
		System.out.println("Payment by Net Bankin: "+bname+" "+acno+" "+amt);
	}
	
	
}