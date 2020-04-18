package OOPConcept;

public class HSBCBank implements UsBank {
	//if a class is implementing any interface then its mandatory to define/override all the methods of interface
	public void credit()
	{
		System.out.println("Credit");
	}
	public void debit()
	{
		System.out.println("Debit");
	}
	public void transfermoney()
	{
		System.out.println("Transfer");
	}

	public void loan()
	{
		System.out.println("Student Loan");
	}
	
	public void carloan()
	{
		System.out.println("Car Loan");
	}
	
	
}
