package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled
{
	@BeforeClass
	public  void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	@Test(enabled=false)//skip method from execution
	public void testA()
	{
		System.out.println("--testA ");
	}
	
	@Test
	public void testB()//default enabled value is true
	{
		System.out.println("--testB");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	
	
}
