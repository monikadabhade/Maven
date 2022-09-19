package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependOnMethod2 
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
	
	@Test(dependsOnMethods= {"testB"})//it execute only after B execute priority does not matter							
	public void testA()
	{
		System.out.println("---testA");
	}
	
	
	@Test(dependsOnMethods={"testC", "testD"},priority=-1)//C,D execute first but D has highest priority
														//then D will execute first		
	public void testB()
	{
		System.out.println("---testB");
	}
	
	@Test(priority=2)
	public void testC()
	{
		System.out.println("---testC");
	}
	
	@Test(priority=1)//it execute before C because it has highest priority than C
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
