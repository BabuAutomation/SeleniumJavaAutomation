package Testng;

import org.testng.annotations.Test;

public class Invocationscount {
	
	
	@Test(invocationCount=10)
	void Login()
	{
		System.out.println("Hello");
	}

}
