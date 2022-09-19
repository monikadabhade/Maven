package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependOnMethod3 
{

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		System.out.println("before Method");
//	}
	
	@Test()
	public void testA()
	{
		System.out.println("---testA");
	}
	
	
	@Test(dependsOnMethods={"testC", "testD"})
	public void testB()
	{
		System.out.println("---testB");
	}
	
	@Test(priority=-1)
	public void testC()
	{
		System.out.println("---testC");
	}
	
	@Test()
	public void testD()
	{
		System.out.println("---testD");
	}
	
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("After Method");
//	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
}
