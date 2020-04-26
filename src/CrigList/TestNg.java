package CrigList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	@Test
	public void demo()
	{
		System.out.println("test");
	}

	@Test
	public void Log()
	{
		System.out.println("test log in");
	}
	
	@Test(groups= {"smoke"})
	public void shut()
	{
		System.out.println("shut down test log in");
	}
	@Test
	public void demo2()
	{
		System.out.println("test2");
	}

	@Test(enabled=false)
	public void Log2()
	{
		System.out.println("test log in  2");
	}
	
	@Test(groups= {"smoke"})
	public void shut6()
	{
		System.out.println("second group shut down test log in");
	}
	
	@Test(dependsOnMethods= {"shut6"})
	public void shut7()
	{
		System.out.println("second group shut down test log in");
	}
	
	@Test
	public void shut2 ()
	{
		System.out.println("shut down test log in 2");
	}
	
	@BeforeTest
	public void Prequest()
	{
		System.out.println("This Is test for before annotation");
	}
	@AfterTest
	public void PreAfter()
	{
		System.out.println("This Is test for After annotation");
	}
	

}
