package Test_NG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount=5)
	public void testMethod1(ITestContext context )
	{
		int CurrentInvocation = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Invocation count : " + CurrentInvocation);
		System.out.println("Test method1");
	}
	
	@Test(invocationCount=3)
	public void testMethod2()
	{
		System.out.println("Test method2");
	}
	
	@Test(invocationCount=2)
	public void testMethod3()
	{
		System.out.println("Test method3");
	}



}
