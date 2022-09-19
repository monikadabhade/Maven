package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");

	}
	
	@Test
	public void testA()
	{
		System.out.println("testA");
	}
	
	@Test
	public void testC()
	{
		System.out.println("testC");
	}
	
	@Test
	public void testB()
	{
		System.out.println("testB");
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
