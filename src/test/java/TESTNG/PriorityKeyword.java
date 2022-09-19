package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityKeyword 
{
	@BeforeClass
	public void beforeClasss()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@Test(priority=0)
	public void testA()
	{
		System.out.println("---testA has priority 0");
	}
	
	@Test(priority=-1)
	public void testB()
	{
		System.out.println("---testB has priority -1");
	}
	
	@Test()
	public void test1()
	{
		System.out.println("---test1 has no prority ");//default priority is 0
	}
	
	@Test(priority=1)
	public void test2()
	{
		System.out.println("---test2 has priority 1");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	
}
