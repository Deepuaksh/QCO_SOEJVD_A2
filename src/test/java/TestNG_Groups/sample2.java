package TestNG_Groups;

import org.testng.annotations.Test;

public class sample2 
{
	@Test(groups="smoke")
	public void demo3()
	{
		System.out.println("Hi Demo3");
	}
	
	@Test
	public void demo4()
	{
		System.out.println("Hi Demo4");
	}

}
