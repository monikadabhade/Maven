package TESTNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependOnMethod 
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
	
	@Test(dependsOnMethods= {"testB"})//testB execute first because testA is depends on B
	public void testA()
	{
		System.out.println("---testA");
	}
	
	
	@Test(dependsOnMethods={"testC", "testD"})//C and D execute first because B depends on C and D
	public void testB()
	{
		System.out.println("---testB");
	}
	
	@Test
	public void testC()
	{
		System.out.println("---testC");
//		Assert.fail();//C,D get executed but B,A not because c is failed and b id depends on C
					//so B is also fail then A cannot executed because it depends on B
	}
	
	@Test
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
