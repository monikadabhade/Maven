package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCount 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	
	@Test(invocationCount=2)
	public void test1()
	{
		System.out.println("----test 1");
	}
	
	@Test(invocationCount=0)//if invocation count is 0 then test method will not executed
	public void test2()
	{
		System.out.println("----test 2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
}
