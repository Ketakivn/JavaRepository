package oop.DataAbstraction;

public class Axis implements RBI
{

	public void custDetails()
	{
		System.out.println("Axis .......Customer Details");
	}

	@Override
	public void deposite() 
	{
		System.out.println("Axis.......Deposite");
	}

	@Override
	public void withdraw() 
	{
		System.out.println("Axis.......Withdraw");
	}

	@Override
	public void rateOfInterest() 
	{
		System.out.println("Axis.......Rate of Interest is 9% ");
	}
	

		


	
	

}
