package testNGSuite2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class3
{
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test 2");
	}
	
	@BeforeClass
	public  void beforeClass()
	{
		System.out.println("before class of Class3");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method of Class3");
	}
	
	@Test
	public void testA()
	{
		System.out.println("--testA of Class3");
	}
	
	@Test
	public void testB()
	{
		System.out.println("--testB of Class3");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method of Class3");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("after class of Class1");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test 2");
	}
	
}
