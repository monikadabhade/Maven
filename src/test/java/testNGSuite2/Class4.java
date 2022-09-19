package testNGSuite2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class4
{
	
	@BeforeClass
	public  void beforeClass()
	{
		System.out.println("before class of Class4");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method of Class4");
	}
	
	@Test
	public void testA()
	{
		System.out.println("--testA of Class4");
	}
	
	@Test
	public void testB()
	{
		System.out.println("--testB of Class4");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method of Class4");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class of Class4");
	}
	
	
}
