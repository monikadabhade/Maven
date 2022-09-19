package testNGSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1
{
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("before Suite.....");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test 1");
	}
	
	@BeforeClass
	public  void beforeClass()
	{
		System.out.println("before class of Class1");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method of Class1");
	}
	
	@Test
	public void testA()
	{
		System.out.println("--testA of Class1");
	}
	
	@Test
	public void testB()
	{
		System.out.println("--testB of Class1");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method of Class1");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("after class of Class1");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test 1");
	}
	
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("after Suite.....");
	}
	
}
