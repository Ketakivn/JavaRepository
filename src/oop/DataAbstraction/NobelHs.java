package oop.DataAbstraction;

//Multiple Inheritance in Java - Interface
public class NobelHs implements IMA,USMA
{
	public void medicalService()
	{
		System.out.println("NobelHs........Medical");
	}

	@Override
	public void cardio() 
	{
		System.out.println("NobelHs.......CardioService");
	}

	@Override
	public void dental() 
	{
		System.out.println("NobelHs.......DentalService");
	}

	@Override
	public void nero() 
	{
		System.out.println("NobelHs.......NeroService");
	}

	@Override
	public void physio() 
	{
		System.out.println("NobelHs.......PhysioService");
	}

	@Override
	public void covid19Test() 
	{
		System.out.println("NobelHs.........Covid19Test");
	}
}
